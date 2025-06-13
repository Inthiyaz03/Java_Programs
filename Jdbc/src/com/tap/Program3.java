package com.tap;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Program3 {

	private static Statement statement;
	private static Connection connection;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		String sql = "Update `employee` "
					+ "set `salary`= `salary` + 5000 "
					+ "where `dept` ='finance'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(url,username,password);
			 statement = connection.createStatement();
			 int i =statement.executeUpdate(sql);
			 System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
