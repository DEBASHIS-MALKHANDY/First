package com.jdbc.utll;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcutil {
	    String url="jdbc:mysql:///octbatch";
		String user="root";
		String password="root1234";
     public jdbcutil() { 
    	 
     }
     static {
 		// Step1: loading and register the Driver
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 		} catch (ClassNotFoundException ce) {
 			ce.printStackTrace();
 		}
 	}
     
     public Connection getConnection() throws SQLException {
    	 return DriverManager.getConnection(url, user, password);
     }
     
     

}
