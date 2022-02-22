package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


// First WebApp using Spring

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody  //Used to get the return statement in chrome i.e., home.jsp
	public String home() {
		System.out.println("Welcome");
		return "home.jsp";
	}

}


//we should use @Controller and @RequestMappping in controller
//If we use tomcat jasper dependency in pom.xml we get output as we print in home.jsp 
//file i.e., in chrome