package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNums extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		int sum=num1+num2;
		
		System.out.println();
		
		PrintWriter printWriter=response.getWriter();
		
		printWriter.println("<html><head><title>Output Page</title></head><body><h5>The answer is: "+sum+"</h5></body></html>");
	}
	
}
