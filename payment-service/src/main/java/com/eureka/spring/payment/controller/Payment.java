package com.eureka.spring.payment.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment {
	
	@RequestMapping("/payment/{amount}")
	public String pay(@PathVariable int amount) {
		return "Payment Succesful with amount of rs : "+amount;
	}

}
