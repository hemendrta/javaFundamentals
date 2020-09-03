/*Example of how to use the different page for different user.*/

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class SalarySlips extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession httpSession=req.getSession();
		String username=(String) httpSession.getAttribute("username");
		
		PrintWriter printWriter=resp.getWriter();
		
		if(username.equals("hemendra")) {
			
			printWriter.print("<!DOCTYPE html>\n" + 
					"<html>\n" + 
					"<head>\n" + 
					"<meta charset=\"UTF-8\">\n" + 
					"<title>Salary Details</title>\n" + 
					"</head>\n" + 
					"<body>\n" + 
					"	Welcome: "+username.substring(0, 1).toUpperCase()+username.substring(1, username.length())+"\n" + 
					"<h4>Please click the lin below to download the Salary Slips</h4><br><a href='#'>Download</a></body>\n" + 
					"</html>");
			
		}else if(username.equals("aditi")) {
			
			printWriter.print("<!DOCTYPE html>\n" + 
					"<html>\n" + 
					"<head>\n" + 
					"<meta charset=\"UTF-8\">\n" + 
					"<title>Salary Details</title>\n" + 
					"</head>\n" + 
					"<body>\n" + 
					"	Welcome: "+username.substring(0, 1).toUpperCase()+username.substring(1, username.length())+"\n" + 
					"<h4>Sorry!!!!<br>Salary-slips not generated yet.</h4></body>\n" + 
					"</html>");
			
		}
	}
	
}
