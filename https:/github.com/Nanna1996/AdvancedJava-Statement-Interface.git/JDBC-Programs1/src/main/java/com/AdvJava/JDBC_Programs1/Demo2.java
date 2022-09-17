package com.AdvJava.JDBC_Programs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hari", "HARSHA", "Hari@123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			ResultSetMetaData rm = rs.getMetaData();
			int n = rm.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=n;i++) {
				System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}		
	}

}
