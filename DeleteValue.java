package task;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteValue {
		
		public static void main(String[] args) throws SQLException{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
			Statement st = con.createStatement();
			
			st.execute("delete from employee where id=2");
			System.out.println("delete data successfully");
}
}
