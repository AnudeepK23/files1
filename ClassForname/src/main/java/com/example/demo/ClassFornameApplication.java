package com.example.demo;

import java.sql.*;

import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassFornameApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ClassFornameApplication.class, args);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Pqr obj = new Pqr();
		
	}

}

class Pqr{
static {
	System.out.println("In Static");
}

{
	System.out.println("In Instance");
}
}