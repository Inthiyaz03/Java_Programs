package com.tap;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Program8 {

	private static Connection connection;
	private static CallableStatement prepareCall;
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		
		String sql = "{call emp_count(?,?)}";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			prepareCall = connection.prepareCall(sql);
			Program1.displayEmployees(connection);
			System.out.println("enter the dept name: ");
			prepareCall.setString(1, scanner.next());
			prepareCall.registerOutParameter(2, Types.INTEGER);
			prepareCall.execute();
			int i = prepareCall.getInt(2);
			System.out.println(i);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
