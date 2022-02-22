package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@EnableHystrix
public class OrderedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderedServiceApplication.class, args);
	}
	
	@Bean
	
	

}
