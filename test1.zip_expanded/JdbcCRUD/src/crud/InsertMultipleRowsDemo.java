package crud;
import java.sql.*;
import java.util.*;
public class InsertMultipleRowsDemo
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/student";
	String user="root";
	String pwd="Login@998";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.out.println("Employee Number:");
		int eno=sc.nextInt();
		System.out.println("Employee Name:");
		String ename=sc.next();
		System.out.println("Employee Sal:");
		double esal=sc.nextDouble();
		System.out.println("Employee Address:");
		String eaddr=sc.next();
		String sqlQuery=String.format("insert into employees values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr);
		st.executeUpdate(sqlQuery);
		System.out.println("Record Inserted Successfully");
		System.out.println("Do U want to Insert one more record[Yes/No]:");
		String option = sc.next();
		if(option.equalsIgnoreCase("No"))
		{
			break;
		}
	}
	con.close();
	
}

}