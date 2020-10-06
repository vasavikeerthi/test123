package com.vk;
import java.sql.Connection;
import java.sql.DriverManager;                      //This code is for inserting data into the table
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vasavi","root","kVKsQL@123");
	    PreparedStatement pst=con.prepareStatement("insert into user values(?,?,?)");
	    pst.setInt(1,4);
	    pst.setString(2, "santhi");
	    pst.setString(3,"abc123");
	   int rows= pst.executeUpdate();
	   if(rows==1)
	   {
		   System.out.println("Data inserted successfully");
	   }
	   else
	   {
		   System.out.println("something went wrong");
	   }
	}

}
