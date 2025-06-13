package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet {
	
	private Connection connection;
	private PreparedStatement statement;
	private PrintWriter out;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = "jdbc:mysql://localhost:3306/servlet3";
		String username = "root";
		String password = "root";
		String sql = "INSERT into `servletuser` (`name`,`lastname`,`email`) values(?,?,?)";
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(url,username,password);
			 statement = connection.prepareStatement(sql);
			 statement.setString(1,req.getParameter("name") );
			 statement.setString(2,req.getParameter("lastname") );
			 statement.setString(3,req.getParameter("email"));
			 
			 int i = statement.executeUpdate();
			  out = resp.getWriter();
			 if(i>0) {
				 out.println("registration succes");
			 }
			 else {
				 out.println("registration failed");
			 }
		
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (Exception e) {
			e.printStackTrace();
	}
		
	}

}
