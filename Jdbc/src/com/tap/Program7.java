package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program7 {

	
	private static Connection connection;
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			Program1.displayEmployees(connection);
			connection.setAutoCommit(false);
			
			transaction();
			Program1.displayEmployees(connection);
			
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void transaction() throws SQLException {
		
		System.out.println("enter the sender: ");
		String sender = scanner.next();
		
		System.out.println("enter the receiver: ");
		String receiver = scanner.next();
		
		System.out.println("enter the amount: ");
		int amount = scanner.nextInt();
		
		// to update balance
		int x = updateBalance(sender, -amount);
		int y = updateBalance(receiver, amount);
			
		//to confirm transaction
		if(isConfirm(x,y)) {
			System.out.println("transaction succesfull.....");
			connection.commit();
		}
		else {
			System.out.println("transaction failed......");
			connection.rollback();
		}	
		System.out.println(x + " : " + y);	
	
	}
	
	
	//helper method;
	private static boolean isConfirm(int x, int y) {
		System.out.println("Do you want continue this transaction ? (yes / no )");
		return scanner.next().equalsIgnoreCase("yes") && x == 1 && y == 1;
	}
	
	
	    //update balance in database;
	private static int updateBalance(String user, int amount) throws SQLException {
		
//		String sql = "UPDATE `EMPLOYEE` set `salary` = `salary` + ? WHERE `name` = ? ";
		String sql = "{call upsal(?,?)}" ;
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, amount);
		preparedStatement.setString(2, user);
		int i = preparedStatement.executeUpdate();
		return i;
		
	}

}
