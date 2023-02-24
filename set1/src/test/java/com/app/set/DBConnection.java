package com.app.set;

import java.sql.DriverManager;
import java.sql.Connection;
import org.junit.Test;

public class DBConnection {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/spring";
	private static final String USER = "JH";
	private static final String PW = "12345";
	
	@Test
	public void testCOnnection() throws Exception{
		
		Class.forName(DRIVER);
		try {
			
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
			System.out.println("good");
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("no");
			
		}
		
		
		
		
	}
	
	
}
