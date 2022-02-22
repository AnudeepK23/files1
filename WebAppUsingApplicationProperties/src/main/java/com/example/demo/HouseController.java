package com.example.demo;



//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


///WebAppUsingApplicationProperties

// In Chrome      http://localhost:8080/home


//@Controller
//public class HouseController {
//	
//	@RequestMapping("home")
////	@ResponseBody  //Used to get the return statement in chrome i.e., home.jsp
//	public String home() {
//		System.out.println("Welcome");
//		return "house";
//	}
//
//}



//Another type is => Requesting data from client server

//@Controller
//public class HouseController {
//	
//	@RequestMapping("home")
////	@ResponseBody  //Used to get the return statement in chrome i.e., home.jsp
//	
//	
//	public String home(HttpServletRequest req,HttpServletResponse res) {
//		
//		HttpSession session = req.getSession();
//		String name=req.getParameter("name");
//		String password=req.getParameter("password");
//		System.out.println("Welcome " +name+ "\n Your Password " +password);
//		session.setAttribute("name", name);
//		session.setAttribute("password", password);
//		return "house";
//	}
//}




//@Controller
//public class HouseController {
//
//
//
//	
//	@RequestMapping("home")
////	@ResponseBody  //Used to get the return statement in chrome i.e., home.jsp
//	
//	
//	public String home(@RequestParam("name","password"), String name, String password  ) {
//		
//		
//		ModelAndView mv = ModelAndView();
//		mv.addObject("name",name);
//		mv.addObject("password",password);
//		mv.setViewName("house");
//		return mv;
//		
//	}
//}

@Controller
public class HouseController{
	
	
	
	@RequestMapping("home")
	public String home(@RequestParam("name") String Myname) {
		
		System.out.println("Welcome");
		
		ModelAndView mv = ModelAndView();
		mv.addObject("name",Myname);
		mv.setViewName("house");
		return mv;
	}

//	private ModelAndView ModelAndView() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

