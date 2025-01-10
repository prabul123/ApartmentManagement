package com.ps.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.http.HttpSession;

public class Apartment {
	private Connection con;
	HttpSession se;
	
	public Apartment(HttpSession session) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apartment", "root", "tiger");
				se = session;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public String Signup(String name,String email,String pass) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String status = "";
		
		
	}
	
}
