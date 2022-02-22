package com.example.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/Billing-done/{bill}")
	public String getBill(@PathVariable int bill) {
		String url="http://FLIP-ORDER/payment-done/ " +bill;
		System.out.println(url);
		return template.getForObject(url, String.class);
	}

}
