package com.vineet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingTryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			
			System.out.println("Problem With loading Driver");
			// TODO: handle exception
		}
		
		String cs = "jdbc:mysql://localhost:3306/vineet";
		
		try(Connection conn = DriverManager.getConnection(cs,"root","12345")) {
			Statement st= conn.createStatement();
			 
			 int x= st.executeUpdate("insert into student values(11,'ajay','delhi',980)");
			 
			 if(x >0 )
				 System.out.println("inserted..");
			 else
				 System.out.println("not inserted");
		} catch ( SQLException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		
	}

}
