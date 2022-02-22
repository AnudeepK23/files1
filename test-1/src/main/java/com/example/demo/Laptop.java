package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	
	private int lid;
	private String Brand;
	
	
	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}

	

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Brand=" + Brand + "]";
	}


	public void compile() {
	System.out.println("Compiled through laptop class");
	}

}
