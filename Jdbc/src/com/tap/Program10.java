package com.tap;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Program10 {

	private static Connection connection;
	private static CallableStatement prepareCall;
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		
		String sql = "{call disp_emp(?) }";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection  = DriverManager.getConnection(url, username, password);
			prepareCall = connection.prepareCall(sql);
			System.out.println("enter the amount: ");
			prepareCall.setInt(1,scanner.nextInt() );
			prepareCall.execute();
			
			ResultSet res = prepareCall.getResultSet();
			boolean found = false;
			System.out.println("------------------------------------------------------------------");
			while(res.next()) {
					System.out.printf("| %-2d | %-8s | %-20s |  %-10s |  %-8d | \n",
						res.getInt("id"),
						res.getString("name"),
						res.getString("email"), 
						res.getString("dept"),
						res.getInt("salary"));
					found = true;
			}
			if(!found) {
				System.out.println("no data available.....");
			}

			 System.out.println("------------------------------------------------------------------");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
