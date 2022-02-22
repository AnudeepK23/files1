package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@PropertySource("classpath:application.properties")
public class DemoEurekaOrderApplication {

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaOrderApplication.class, args);
	}

}
