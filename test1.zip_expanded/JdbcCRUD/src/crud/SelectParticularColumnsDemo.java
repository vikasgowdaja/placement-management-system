package crud;
import java.sql.*;
public class SelectParticularColumnsDemo
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/demovikas";
	String user="root";
	String pwd="Login@998";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	String sqlQuery="select ename,eaddr from employees";
	boolean flag=false;
	ResultSet rs =st.executeQuery(sqlQuery);
	System.out.println("ENAME\tEADDR");
	System.out.println("------------------");
	while(rs.next())
	{
	flag=true;
	System.out.println(rs.getString("ename")+"\t"+rs.getString("eaddr"));
	//System.out.println(rs.getString(1)+"\t"+rs.getString(2));
	}
	if(flag==false)
	{
		System.out.println("No Records found");
	}
	con.close();
		
}

}