package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PersonalInfo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession httpSession=req.getSession();
		String username=(String)httpSession.getAttribute("username");
		PrintWriter writer=resp.getWriter();
		
		
		writer.print("<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<title>"+username.substring(0, 1).toUpperCase()+username.substring(1, username.length())+"</title>\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"	<h4>Welcome:"+username.substring(0, 1).toUpperCase()+username.substring(1, username.length())+"</h4>\n" + 
				"	\n" + 
				"	<h5>This is a demo page for the profiles on which we will have the profile information of the candidate.</h5>\n" + 
				"	\n" + 
				"	<form action=\"uploadFile\" method=\"post\" enctype=\"multipart/form-data\">\n" + 
				"	\n" + 
				"		<input type=\"file\" name=\"profileData\"> <br>\n" + 
				"		<input type=\"submit\">\n" + 
				"	\n" + 
				"	</form>\n" + 
				"	\n" + 
				"</body>\n" + 
				"</html>");
		
	}

}
