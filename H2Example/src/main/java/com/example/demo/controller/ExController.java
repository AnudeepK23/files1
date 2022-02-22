package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repository.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class ExController {
	
	
	//Spring Boot Data JPA MVC H2 Rest Examples
	
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String paddy() {
		return "pages.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		repo.save(alien);
		return "pages.jsp";
		
		
	}
	
	
	// 1 ==>  http://localhost:8080/showAlien?id=1
	
	
//	@RequestMapping("/showAlien")
//	@ResponseBody
//	public ModelAndView showAlien(@RequestParam int id) {
//		
//		ModelAndView mv = new ModelAndView("show.jsp");
//		
//		
//		
//		Alien alien = repo.findById(id).orElse(new Alien());
//		
//		System.out.println(repo.findByName("Puppy"));
//		System.out.println(repo.findByIdGreaterThan(2));
//		
//		System.out.println(repo.findByNameSorted("Ram"));
//		
//		System.out.println(repo.findByIdLesserThan(3));
//		mv.addObject(alien);
//		return mv;
//		
//		
//	}
	
	
	
	
//	// 2 ==>  http://localhost:8080/alien/4
//	
//	@RequestMapping("/alien/{id}")
//	@ResponseBody
//	public String showAlien(@PathVariable("id") int id) {
//		
//		return repo.findById(id).toString();
//		
//		
//		
//		
//	}
//	
//	
//	//To fetch all data
//	
//	// 3 ==>  http://localhost:8080/aliens
//	
//	@RequestMapping("/aliens")
//	@ResponseBody
//	public String showAlien() {
//		
//		return repo.findAll().toString();
//		
//		
//		
//		
//	}
	
	
//	// 4 ==>
//	
//	//To get data in JPA format
//	
//	//   http://localhost:8080/alien/4
//	
//		@RequestMapping("/alien/{id}")
//		@ResponseBody
//		public Optional<Alien> showAlien(@PathVariable("id") int id) {
//			
//			return repo.findById(id);
//			
//			
//			
//			
//		}
//		
//		
//		//To fetch all data
//		
//		//   http://localhost:8080/aliens
//		
//		@RequestMapping("/aliens")
//		@ResponseBody
//		public List<Alien> showAlien() {
//			
//		
//			
//			return repo.findAll();
//				
//		}

	
	// 5 ==> Creating Negotation and getting data in xml format 
	//Used dependency Jackson Dataformat XML
	
	//Use Postman
	
	// In Postman Select "GET"
	
	//In Headers Key is accept value is application/xml 
	//To get data in xml
	
//	// OR
//	
//	//In Headers Key is accept value is application/json 
//		//To get data in json
//	
//	
//		
//		//   http://localhost:8080/alien/4
//		
//			@RequestMapping("/alien/{id}")
//			@ResponseBody
//			public Optional<Alien> showAlien(@PathVariable("id") int id) {
//				
//				return repo.findById(id);
//			}
//			
//			
//			//To fetch all data
//			
//			//   http://localhost:8080/aliens
//			
//			@RequestMapping("/aliens")
//			@ResponseBody
//			public List<Alien> showAlien() {
//				
//				return repo.findAll();
//					
//			}
	
	
	// 6 ==>
				
			//   http://localhost:8080/alien/4
			
				@RequestMapping("/alien/{id}")
				@ResponseBody
				public Optional<Alien> showAlien(@PathVariable("id") int id) {
					
					return repo.findById(id);
				}
				
				
				//To fetch all data
				
				//To get data in only Xml format
				
				//   http://localhost:8080/aliens
				
				@RequestMapping(path="/aliens", produces= {"application/xml"})
				@ResponseBody
				public List<Alien> showAlien() {
					
					return repo.findAll();
						
				}

}
