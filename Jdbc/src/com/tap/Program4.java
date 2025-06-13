package com.tap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Program4 {

	private static Connection connection;
	private static ResultSet res;
	private static PreparedStatement prepareStatement;
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		String sql = "SELECT * from `employee` where dept = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			prepareStatement  = connection.prepareStatement(sql);
			System.out.println("enter the department: ");
			prepareStatement.setString(1,scanner.next());
			res = prepareStatement.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt("id") + "," +
				res.getString("name") + "," +
				res.getString("email") + "," +
				res.getString("dept") + "," +
				res.getInt("salary"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
