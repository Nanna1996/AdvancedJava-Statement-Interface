package com.AdvJava.JDBC_Programs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatement_Inserting {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hari", "HARSHA", "Hari@123");
//        Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("insert into ravi values (?,?)");
			ps.setInt(1,Integer.parseInt(args[0]));
			ps.setString(2, args[1]);
			ps.executeUpdate();
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        System.out.println("One Record Inserted Successfully");
	}

}
