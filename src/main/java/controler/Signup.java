package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;


@WebServlet("/signup")
public class Signup  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("email");
		String password=request.getParameter("password");
		String store="password";
		
		long phone1=Long.parseLong(phone);
		if(store.equals(password)) {
			String status=enq.singup(name,email,phone,password);
			if(store.equals("existed")) {
				request.setAttribute("status", "Already Registered");
				RequestDispatcher rd1=request.getRequestDispatcher("Login.jsp");
				rd1.forward(request, resp);
			}else if(status.equals("success")) {
				request.setAttribute("status","Successfully Registered");
				RequestDispatcher rd1 = request.getRequestDispatcher("Login.jsp");
				rd1.forward(request, resp);
				
			}else if(status.equals("failed")) {
				request.setAttribute("status","failed to Registered");
				RequestDispatcher ed1=request.getRequestDispatcher("Login.jsp");
				rd1.forward(request, resp);
				
			}
			
		}
	}
}











