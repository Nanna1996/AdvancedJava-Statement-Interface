package com.AdvJava.JDBC_Programs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hari", "HARSHA", "Hari@123");
			Statement st = con.createStatement();
			st.execute("create table student (sid int,sname varchar(20),smarks int)");
			System.out.println("Table Created Successfully");
		} catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
	
	}

}
