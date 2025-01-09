package com.ps.Controller;

import java.io.IOException;

import com.ps.Model.Apartment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class Register extends HttpServlet{
	
	private void processRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		resp.setContentType("text/html");
		HttpSession se = req.getSession();
		Apartment ap = new Apartment(se);
		
		try {
			if(req.getParameter("register")!=null) {
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			processRequest(req,resp);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
