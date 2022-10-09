package com.jdbc.connector;

import java.sql.*;

public class CreateTableUsingJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "satya");

			String q = "create table table1(studentId int(20) primary key auto_increment,studentName varchar(200) not null,studentCity varchar(400))";

			// create a statement
			Statement statement = connection.createStatement();

			statement.executeUpdate(q);

			System.out.println("table create in datebase.............");

			connection.close();

		} catch (Exception e) {
			// TODO: handle exception finally {
			e.printStackTrace();
		}
	}
}

