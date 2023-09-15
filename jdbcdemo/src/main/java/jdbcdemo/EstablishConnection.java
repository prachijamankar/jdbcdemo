package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class EstablishConnection {
	
	public static void main(String[] args) throws SQLException {
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","root");
	
	//we have to pass the url,uname,pwsd od database as actual argument for getconnection method.
	// getConnection method retuen connection object if the url,name,pswd is correct if not throws SQLException
	 
	java.sql.Statement st = con.createStatement();
	
	// we create a statement to send our requirments to the database.
			
	//st.execute("create database college");
	//st.execute("create database University");
	//st.execute("create database Department");
	
	st.execute("create table student(id int, name varchar(10), age int) ");
	System.out.println("database created Successfully");
	
		
	}
	

}
