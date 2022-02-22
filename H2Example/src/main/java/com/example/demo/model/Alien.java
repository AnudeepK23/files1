package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Alien {
	
	@Id
	private int id;
	private String name;
	private double num;
	
//	public Alien(int id, String name, double num) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.num = num;
//	}
	
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
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", num=" + num + "]";
	}

	
}
