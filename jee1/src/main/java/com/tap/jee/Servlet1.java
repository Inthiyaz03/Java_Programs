package com.tap.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("username");
		PrintWriter out = resp.getWriter();
		out.print("<h1>hello" + un);
		out.print("<h2>hello" + un);
		out.print("<h3>hello" + un);
		out.print("<h4>hello" + un);
	}
	
	
}
