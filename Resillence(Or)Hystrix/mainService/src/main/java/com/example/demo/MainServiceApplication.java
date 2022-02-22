package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableHystrix

public class MainServiceApplication {
	
	@Autowired
	private RestTemplate template;
	
	@LoadBalanced
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MainServiceApplication.class, args);
	}
	
	@HystrixCommand(fallbackMethod = "Booked")
	@GetMapping("/order")
	public String getBooked() {
		String billing = template.getForObject("http://localhost:8001/bill/com/", String.class);
		String payment = template.getForObject("http://localhost:8002/payment/payNow", String.class);
		return billing+ " " +payment;
	}
	
	@GetMapping("/orderwithoutHystrix")
	public String Book() {
		String billing = template.getForObject("http://localhost:8001/bill/com/", String.class);
		String payment = template.getForObject("http://localhost:8002/payment/payNow", String.class);
		return payment+ " Completed " +billing ;
	}
	
	public String Booked() {
		return "Server down" ;
	}

}
