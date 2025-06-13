package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String un =	req.getParameter("username");
	String pass = req.getParameter("password");
	
	PrintWriter out = resp.getWriter();
	out.print("hello " + un + " welcome to the world!");
	}
	
	
	
}
