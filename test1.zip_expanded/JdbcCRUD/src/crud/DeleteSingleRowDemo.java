package crud;
import java.sql.*;
public class DeleteSingleRowDemo
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/student";
	String user="root";
	String pwd="Login@998";
	String sqlQuery="delete from employees where ename='Vikas'";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	int updateCount=st.executeUpdate(sqlQuery);
	System.out.println("The number of rows deleted :"+updateCount);
	con.close();	
}

}