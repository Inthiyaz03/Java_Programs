package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/callservelet")
public class Servlet1  extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int  n = Integer.parseInt(req.getParameter("nvalue"));
		PrintWriter out = resp.getWriter();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				out.print("*");
			}
			out.println();
		}
		
		
	}

}
