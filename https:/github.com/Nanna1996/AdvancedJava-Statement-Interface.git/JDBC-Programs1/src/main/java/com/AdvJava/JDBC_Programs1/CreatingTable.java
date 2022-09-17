package com.AdvJava.JDBC_Programs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreatingTable 
{
    public static void main( String[] args )
    {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hari", "HARSHA", "Hari@123");
			Statement st = con.createStatement();
			st.execute("create table ravi (id int,name varchar(20))");
			System.out.println("Table created successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
    
    }
}
