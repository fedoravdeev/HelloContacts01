package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello01")
public class HelloContacts extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
												
		PrintWriter out = response.getWriter(); 
												
		out.write("<!DOCTYPE html>\n" + 										
				"<html>\n" 
				+ "<head><title>Hello Contacts.</title></head>\n"
				+ "<body bgcolor=\"#fdf5e6\">\n" + "<h1>Note:</h1>\n"
				+ "<p>Hello Contacts was created via servlet</p>\n" + "</body></html>");
	}

}
