package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropTableDemo {

	public static void main(String[] args)throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/database";
		String user="root";
		String pwd="Login@998";
		String sql_query="drop table employees";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table deleted successfully..!");
		con.close();
	}

}