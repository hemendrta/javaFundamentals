package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class CheckAuth extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=(String)req.getAttribute("username");
		String password=(String)req.getAttribute("password");
		PrintWriter printWriter=resp.getWriter();
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		
		if(username.equalsIgnoreCase("hemendra")) {
			
			printWriter.print("<html><head><title>Admin Page</title></head><body><h4 style=text-align:center;>Welcome: "+username+"</h4><a href='salarySlips'>Salary Slip</a><br><a href=''>Personal Information</a></body></html>");
			
		}
		else {
			
			printWriter.print("<html><head><title>User Page</title></head><body><h4 style=text-align:center;>Welcome: "+username+"</h4><a href='salarySlips'>Salary Slip</a><br><a href=''>Personal Information</a></body></html>");
			
		}
		
		
	}

}
