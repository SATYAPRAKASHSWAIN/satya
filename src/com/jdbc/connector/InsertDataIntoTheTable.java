package com.jdbc.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataIntoTheTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "satya");
			
			String q="insert into table1(studentName,studentCity) values(?,?)";
			
			//get the prepaired statement object
			PreparedStatement statement = connection.prepareStatement(q);
			
			//set the values to query
			
			statement.setString(1, "Satyaprakash");
			statement.setString(2, "Kendrapara");
			
			statement.executeUpdate();
			
			
			System.out.println("inserted........");
			connection.close();

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
