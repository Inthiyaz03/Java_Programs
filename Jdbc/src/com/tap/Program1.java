package com.tap;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program1 {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet res;

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			res = displayEmployees(connection);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(connection, statement, res);
		}
	}

	public static ResultSet displayEmployees(Connection connection) throws SQLException {

		ResultSet res;
		Statement statement = connection.createStatement();
		res = statement.executeQuery("SELECT * from employee");
		System.out.println("------------------------------------------------------------------");
		while (res.next()) {
			System.out.printf("| %-2d | %-8s | %-20s |  %-10s |  %-8d | \n", res.getInt("id"), res.getString("name"),
					res.getString("email"), res.getString("dept"), res.getInt("salary"));
		}

		System.out.println("------------------------------------------------------------------");
		return res;
	}

	public static void close(Connection connection, Statement statement, ResultSet res) {
		try {
			if (res != null) {

				res.close();
			}
			if (statement != null) {

				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}