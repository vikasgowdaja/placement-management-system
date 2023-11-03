package crud;
import java.sql.*;
public class InsertSingleRowDemo
{
	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/database";
		String user="root";
		String pwd="Login@998";
		String sql_query="insert into employees values(4,'sachin',300000,'Hassan')";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sql_query);
		System.out.println("The number of rows inserted :"+updateCount);
		con.close();
		
	}

}