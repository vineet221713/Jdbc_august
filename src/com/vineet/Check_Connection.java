package com.vineet;

import java.sql.Connection;
import java.sql.DriverManager;

public class Check_Connection {

	public static void main(String[] args) {
		
		
		
		
		// Here We First check the connection ;

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Problem With loading Driver");
		}
		
		String cs = "jdbc:mysql://localhost:3306/vineet";
		
		try {
			Connection conn = DriverManager.getConnection(cs,"root","12345");
			
			if(conn!=null) {
				System.out.println("Connected");
			}
			else
				System.out.println("not connected");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
