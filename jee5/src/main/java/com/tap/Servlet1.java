package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1  extends HttpServlet {
	static int  count =3;      
	

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		
		String s  = "son2023";
		String pass = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		
		Cookie cookie = new Cookie("password", pass);
		resp.addCookie(cookie);
		
		resp.setContentType("text/html" );
		
		if("son123".equals(pass)) {
			out.println("Welcome to home page ");
		}
		else if(count>0) {
				out.println("Invalid password, "+ count +  " attempts left......!");
				count--;
				RequestDispatcher re = req.getRequestDispatcher("index.html");
				re.include(req, resp);
			 
		}
		else {
			out.println("attempts over.,...go fuck yourself");
		}
		
		
	}
	
	
}
