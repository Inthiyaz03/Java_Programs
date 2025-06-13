package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class MetaData {

	private static Connection con;
	private static ResultSet res;
	private static Statement stmt;
	private static ResultSetMetaData metaData;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String userName = "root";
		String password = "root";
		String sql = "SELECT * FROM `employee`";
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, userName, password);
				stmt = con.createStatement();
				res = stmt.executeQuery(sql);
				metaData = res.getMetaData();
				
				int colCount = metaData.getColumnCount();
				System.out.println(colCount);
				
				for(int i=1;i<=colCount;i++) {
					System.out.println("column : " + i);
					String columnName = metaData.getColumnName(i);
					System.out.println(columnName);
					
					String columnClassName = metaData.getColumnClassName(i);
					System.out.println(columnClassName);
					
					int columnDisplaySize = metaData.getColumnDisplaySize(i);
					System.out.println(columnDisplaySize);
					
					String columnTypeName = metaData.getColumnTypeName(i);
					System.out.println(columnTypeName);
					
					int columnType = metaData.getColumnType(i);
					System.out.println(columnType);
					System.out.println("--------------------");
				}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
