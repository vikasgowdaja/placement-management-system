package crud;
import java.sql.*;
public class UpdateSingleRowDemo
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/demovikas";
	String user="root";
	String pwd="Vikas@998";
	String sql_query="update employees set esal=1000000 where ename='Vikas Gowda J A'";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	int updateCount=st.executeUpdate(sql_query);
	System.out.println("The number of rows updated :"+updateCount);
	con.close();
		
}

}