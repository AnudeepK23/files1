package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/request-payment/{amount}")
	public String callPaymentService(@PathVariable int amount)
	{
//		String URL="http://localhost:8001/payment/"+amount;
//		OR
		String URL="http://PAYMENT-SERVICE/payment/"+amount;
		System.out.println(URL);
		return restTemplate.getForObject(URL, String.class);
	}

}
