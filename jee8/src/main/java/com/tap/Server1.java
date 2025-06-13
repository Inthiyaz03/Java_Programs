package com.tap;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/callservlet")
public class Server1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
			HttpSession ses = req.getSession();
		ses.setAttribute("n", name);
		ses.setAttribute("l", lastname);
		
		
		 RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		 rd.forward(req, resp);
		
	}
	
	
}
