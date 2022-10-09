package com.jdbc.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDataFromDataBase {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "satya");

			String q = "select * from table1";

			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(q);
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println(name + ", " + id + " ," + city);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
