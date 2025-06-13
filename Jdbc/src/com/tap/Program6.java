package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Program6 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		String sql ="INSERT into `employee` (`id`,`name`,`email`,`dept`,`salary`) values (?,?,?,?,?)";
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(url,username,password);
			Program1.displayEmployees(connection);
			
			preparedStatement = connection.prepareStatement(sql);
			
			String choice = null;
			do {
				
				System.out.print("enter the id: ");
				preparedStatement.setInt(1, scanner.nextInt());
				
				System.out.print("enter the name: ");
				preparedStatement.setString(2, scanner.next());
				
				System.out.print("enter the mail: ");
				preparedStatement.setString(3,scanner.next());
				
				System.out.print("enter the dept: ");
				preparedStatement.setString(4, scanner.next());
				
				System.out.print("enter the salary: ");
				preparedStatement.setInt(5, scanner.nextInt());
				
				preparedStatement.addBatch();
				
				
				System.out.println("Do you want to enter more employee details ? (yes / no)");
				choice = scanner.next();
			} 
			
			while (choice.equalsIgnoreCase("yes"));
			
			int [] arr = preparedStatement.executeBatch();
			
			for (int i : arr) {
				System.out.println(i);
			}
			
			Program1.displayEmployees(connection);
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		Program1.close(connection, preparedStatement, null);
	}

}
