package com.jdbc.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnector {
   public static void main(String[] args){
	try {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya","root","satya");
	   con.close();
	   if(con.isClosed())
	   {
		   System.out.println("closed");
	   }
	   else 
	   {
		  System.out.println("open");
	   }
	}catch (Exception e) {
		e.printStackTrace();
	}
	   
	   
	   
  }
	
}
