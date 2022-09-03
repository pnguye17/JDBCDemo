package com.peter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		String url1 = "jdbc:mysql://localhost:3306/test1";
        String user ="root";
        String password = "secret";
        try ( Connection connection = DriverManager.getConnection(url1, user, password)) {
        	System.out.println("connected");
        } catch ( SQLException e) {
        	e.printStackTrace();
        	System.out.println("error");
        }
        
          
}
}
