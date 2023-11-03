package crud;
import java.sql.*;
public class CreateTableDemo 
{
	
	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pwd="Login@998";
		String sql_query="create table employees(eno int(5) primary key,ename varchar(20),esal double(10,2),eaddr varchar(20))";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table Created Successfully");
		con.close();
	}
	
	

}
