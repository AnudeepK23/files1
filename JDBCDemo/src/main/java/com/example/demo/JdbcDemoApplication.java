package com.example.demo;

import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(JdbcDemoApplication.class, args);
		
		//To get only one username from database
		
//		String url = "jdbc:mysql://localhost:3306/crud";
//		String uname="root";
//		String pass = "root";
//		String query = "select username from jd where id=2";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st  = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		
//		rs.next(); //To go to next line in sql if the query is already executed.
//		String name = rs.getString("username");
//		System.out.println(name);
//		st.close();
//		con.close();
		
		//To fetch all the data from sql
		
//		String url = "jdbc:mysql://localhost:3306/crud";
//		String uname = "root";
//		String pass = "root";
//		String query = "select * from jd";
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
//		
//		ResultSet rs = st.executeQuery(query); 
//		
//		while(rs.next()) 
//		{
//		String userdata = rs.getInt(1)+ " " +rs.getString(2);
//		System.out.println(userdata);
//		}
//		
//		st.close();
//		con.close();
		
		
		
//		//To insert data and send data to sql
//		
//		String url = "jdbc:mysql://localhost:3306/crud";
//		String uname = "root";
//		String pass = "root";
//		
//		// 1==>
////		String query = "insert into jd values (5,'Brahma')";
//		
//		//or
//		int id =7;
//		String username = "Urvasi";
//		String query = "insert into jd values (" + id + ", ' " + username + " ')";
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
//		
//		int count = st.executeUpdate(query);
//		System.out.println(count+ "row/s affected");
//		
//	
//		
//		st.close();
//		con.close();
//		
		
		//To insert more data into sql we use PreparedStatement
		
		String url = "jdbc:mysql://localhost:3306/crud";
		String uname = "root";
		String pass = "root";
		int id = 9;
		String username = "Chiru";
		String query = "insert into jd values (?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, username);
		int count = st.executeUpdate();
		
		System.out.println(count+ "row/s affected");
		
		st.close();
		con.close();
		
	}

}
