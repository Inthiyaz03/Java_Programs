package com.tap;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Program9 {

	private static Connection connection;
	private static CallableStatement prepareCall;
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		String sql = "{call emp_count_salary (?)}";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			prepareCall = connection.prepareCall(sql);
			Program1.displayEmployees(connection);
			System.out.println("enter the salary: ");
			prepareCall.setInt(1,scanner.nextInt());
			prepareCall.registerOutParameter(1,Types.INTEGER);
			prepareCall.execute();
			int i = prepareCall.getInt(1);
			System.out.println(i);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
