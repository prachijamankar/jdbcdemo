package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsetValues {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		Statement st = con.createStatement();
		
		st.execute("insert into teacher values(1,'prachi','java' )");
		st.execute("insert into teacher values(2,'pari','math' )");
		st.execute("insert into teacher values(3,'rani','science' )");
		st.execute("insert into teacher values(4,'tanu','english' )");
		st.execute("insert into teacher values(5,'rashmi','marathi' )");
		st.execute("insert into teacher values(6,'tara','history' )");
		st.execute("insert into teacher values(7,'laksh','chemistry' )");
		st.execute("insert into teacher values(8,'raj','physics' )");
		st.execute("insert into teacher values(9,'prajwal','english' )");
		st.execute("insert into teacher values(10,'sanu','geography' )");
		
		System.out.println("values inserted succsessfully");
		
		
		
		
	}

}
