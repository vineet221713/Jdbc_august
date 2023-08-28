package com.vineet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Inserting_A_Record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Problem with loading driver");
		}
		
		
		String sc = "jdbc:mysql://localhost:3306/vineet";
		
		try {
			Connection conn = DriverManager.getConnection(sc,"root","12345");
			Statement st = conn.createStatement();
			
			int x = st.executeUpdate("insert into student values(10,'ram','delhi',780)");

			if(x>0) {
				System.out.println("Data inserted");
			}
			else 
				System.out.println("Data is not inserted");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
