package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	
	@GetMapping("/ThankYou")
	public String getBill() {
		return "Your Payment Received";
	}
	
	@GetMapping("/Bore/{name}")
	public String Billing(@PathVariable String name) {
		return  "Hi " +name+ " Your Payment is still Processing dushkill ";
	}

}
