package com.AdvJava.JDBC_Programs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hari", "HARSHA", "Hari@123");
			Statement st = con.createStatement();
			st.executeUpdate("insert into ravi values (101,'Harsha')");
			System.out.println("Data Inserted Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
