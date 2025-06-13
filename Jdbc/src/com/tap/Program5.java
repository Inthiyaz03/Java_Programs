package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Program5 {

	private static Connection connection;
	private static PreparedStatement prepareStatement;
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		String sql = "UPDATE `employee` "
				+ "set `salary` = `salary` + ?"
				+ " where dept = ?";
		Program1.main(args);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			 prepareStatement = connection.prepareStatement(sql);
			 System.out.println("enter the increment: ");
			 prepareStatement.setInt(1, scanner.nextInt());
			 System.out.println("enter the dept: ");
			 prepareStatement.setString(2, scanner.next());
			 int i = prepareStatement.executeUpdate();
			 System.out.println(i);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Program1.displayEmployees(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
