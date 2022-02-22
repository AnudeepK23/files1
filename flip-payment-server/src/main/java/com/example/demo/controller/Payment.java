package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/payment-provider")
public class Payment {
	
	@GetMapping("/pay/{price}")
	public String getPay(@PathVariable int price) {
		return "This payment was proccessed" +price;
	}
	
	
	

}
