package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDaoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcDaoDemoApplication.class, args);
		
		StudentDAO dao = new StudentDAO();
		Student s2 = new Student();
		s2.id = 11;
		s2.username = "Surya";
		dao.connect();
		dao.addStudent(s2);

	}

}

class StudentDAO
{
	Connection con = null;
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Student getStudent(int id)
	{
		try {
			Student query = "select username from jd where id= "+id;
			Student s = new Student();
			s.id = id;
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.username = name;
			return s;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public void addStudent(Student s) {
		String query = "insert into jd value (?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, s.id);
			pst.setString(2, s.username);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Student{
	int id;
	String username;
}