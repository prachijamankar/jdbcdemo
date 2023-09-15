package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
	
	public static void main(String[] args) throws SQLException {
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
	
	Statement st = con.createStatement();
	
	st.execute("create table employee1(id int,name varchar(20),age int,location varchar(20),cont varchar(10))");
	System.out.println("table create succssefully");
	
	st.execute("insert into employee values(1,'prachi',23,'wardha','9465347283' )");
	st.execute("insert into employee values(2,'pari',20,'wardha','9962341733' )");
	st.execute("insert into employee values(3,'rani',21,'pune','9962341733' )");
	st.execute("insert into employee values(4,'tanu',23,'nagpur','6758495042' )");
	st.execute("insert into employee values(5,'rashmi',22,'selu','6574839300' )");
	System.out.println("value insert successfully");
	
	
	}

}
