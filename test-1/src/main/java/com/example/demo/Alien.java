package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //used to get object

//@Scope(value="prototype")

public class Alien {

	private int id;
	private String name;
	private String place;
	
	@Autowired  //Used to get class values 
	@Qualifier("lap1") //Used to get named values of the class
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Alien() {
		super();
		
		System.out.println("Object Created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", place=" + place + ", laptop=" + laptop + "]";
	}
	public void show(){
		System.out.println("Showed code");
		laptop.compile();
	}

}
