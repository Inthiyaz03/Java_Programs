package com.tap;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class Program2 {

	public static Connection connection;
	private static Statement statement;
	
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		 
		String sql =  "Insert into `employee` (`id`,`name`,`email`,`dept`,`salary`) values"
				+ " (6,'bruce','bruce@gmail.com','science',456788)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.createStatement();
			int i = statement.executeUpdate(sql);
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	
	}

	private static void close() {
		try {
			if(statement!=null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
