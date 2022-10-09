package com.jdbc.connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicInputePrepairedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "satya");

			String q = "insert into table1(studentName,studentCity,StudentId) values(?,?,?)";

			PreparedStatement Statement = connection.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name:");

			String name = br.readLine();

			System.out.println("Enter your city:");

			String city = br.readLine();
			
			System.out.println("Enter the student id :");
			int id = Integer.parseInt(br.readLine());

			Statement.setString(1, name);
			Statement.setString(2, city);
			Statement.setInt(3, id);

			

			System.out.println("Inserted...........");

			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
