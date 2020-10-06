package com.vk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcSelectDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/vasavi","root","kVKsQL@123");
		Statement stmt=  connection.createStatement();
		ResultSet users =  stmt.executeQuery("select * from user");
		while(users.next()) {
			System.out.println(users.getInt(1)+","+users.getString(2)+","+users.getString(3));
		}
	}
}