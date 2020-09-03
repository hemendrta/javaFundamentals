package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadProfile extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletFileUpload servletFileUpload=new ServletFileUpload(new DiskFileItemFactory());
		
		
		try {
			List<FileItem> fileItems=servletFileUpload.parseRequest(req);
			for (FileItem fileItem : fileItems) {
				fileItem.write(new File("/home/hemendra/eclipse-workspace/demoproject/uploads/"+fileItem.getName()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
