package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello01")
public class HelloContacts extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String helloContacts = "a";
		response.setContentType("text/html"); 
		
		PrintWriter out = response.getWriter(); 
												
		out.write("<!DOCTYPE html>\n" + 										
				"<html>\n" 
				+ "<head><title>Hello Contacts.</title></head>\n"
				+ "<body bgcolor=\"#fdf5e6\">\n" + "<h1>Note:</h1>\n"
				+ "<p>Hello Contacts was created via servlet</p>\n" + "</body></html>");
		
 /*       try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/contacts";
            String login = "postgres";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM CONTACTS");
                
                while (rs.next()) {
                    String str = rs.getString("contact_id") + ":" + rs.getString(2);                    
                    helloContacts = "<br> Contact:" + str;
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	*/	
		
		

	}

}
