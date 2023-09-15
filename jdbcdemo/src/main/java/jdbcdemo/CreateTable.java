package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		Statement st = con.createStatement();
		
		//st.execute("create table student(id int,name varchar(20),age int)");
		//System.out.println("table create succssefully");
		
		st.execute("insert into student values(1,'prachi',23 )");
		st.execute("insert into student values(2,'pari',20 )");
		st.execute("insert into student values(3,'rani',21 )");
		st.execute("insert into student values(4,'tanu',23 )");
		st.execute("insert into student values(5,'rashmi',22 )");
		st.execute("insert into student values(6,'tara',23 )");
		st.execute("insert into student values(7,'laksh',20 )");
		st.execute("insert into student values(8,'raj',23 )");
		st.execute("insert into student values(9,'prajwal',23 )");
		st.execute("insert into student values(10,'sanu',22 )");
		
		System.out.println("values inserted succsessfully");
		
		//System.out.println("insert value succssefully");
		
		
	}

}
