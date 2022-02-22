package com.example.demo.controller;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController

public class OrderController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/payment-done/{price}")
	public String getOrder(@PathVariable int price) {
		String URL="http://FLIP-PAYMENT-SERVER/payment-provider/pay/" +price;
		System.out.println(URL);
		return template.getForObject(URL, String.class); 
	}

}
