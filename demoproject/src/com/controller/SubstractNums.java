/*Servlet to substract two numbers.*/


package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubstractNums extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int subs=num1-num2;
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("<html><head><title>Output Page</title></head><body><h4>"+subs+"</h4></body></html>");
	}
	
}
