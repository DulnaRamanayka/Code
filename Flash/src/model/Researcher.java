package model;

import java.sql.*; 

public class Researcher {

	private Connection connect() 
	 { 
		Connection con = null; 
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
	 
			//Provide the correct details: DBServer/DBName, username, password 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paflab6", "root", ""); 
			System.out.println("Successfully connected");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		return con; 
	 }
}
