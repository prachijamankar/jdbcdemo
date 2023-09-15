package jdbcdemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteValue {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		Statement st = con.createStatement();
		
		st.execute("delete from Student where id=2");
		System.out.println("delete data successfully");
		
	}

}
