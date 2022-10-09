package com.jdbc.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJdbcConnector {
	public static void main(String[] args) {
		try {
			//load the connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String url="jdbc:mysql://localhost:3306/satya";
			Connection connection = DriverManager.getConnection(url,"root","satya");
			
			if(connection.isClosed()) {
				System.out.println("Connection is Close");
			}else {
				System.out.println("Connection created...........");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
