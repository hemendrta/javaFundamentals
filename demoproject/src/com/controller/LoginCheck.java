package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter printWriter=response.getWriter();
		
		
		if((username.equals("hemendra") || username.equals("aditi")) && password.equals("Destiny@2018")) {
		
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("checkAuth"); 
			requestDispatcher.forward(request, response);
		
		
		
//		printWriter.print("<html><head><title>Admin Page</title></head><body><h3>Welcome: "+username+"</h3></body></html>");
		}else {
			
			printWriter.print("<html><head><title>Error Page</title></head><body><h3>Sorry, Wrong Credentials</h3></body></html>");
			
		}
		
	}
	
}
