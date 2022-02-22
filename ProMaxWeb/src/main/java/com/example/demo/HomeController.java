package com.example.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
//	@RequestMapping("home")
//	public String pad(HttpServletRequest req) {
//		
//		
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("Gundu " +name);
//		session.setAttribute("name",name);
//		return "tink";
//	}
	
	
//	@RequestMapping("home")
//	public ModelAndView pad(@RequestParam("email") String myEmail) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("email", myEmail);
//		
//		mv.setViewName("tink");
//		System.out.println(myEmail);
//		return mv;
//		
//		
//		
//	}
	
	@RequestMapping("home")
	public ModelAndView pad(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		
		mv.setViewName("tink");
		System.out.println(obj.id,"," +aname+ ","+obj.num);
		return mv;
		
		
		
	}

}
