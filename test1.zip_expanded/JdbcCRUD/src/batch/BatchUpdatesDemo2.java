package batch;
import java.sql.*;
import java.util.Scanner;
public class BatchUpdatesDemo2 {
public static void main(String[] args) throws Exception{
String jdbc_url="jdbc:mysql://localhost:3306/demovikas";
String user="root";
String pwd="Vikas@998";
Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
Statement st = con.createStatement();
PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?)");
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
	pst.setInt(1,eno);
	pst.setString(2,ename);
	pst.setDouble(3,esal);
	pst.setString(4,eaddr);
	pst.addBatch();
	System.out.println("Do U want to Insert one more record[Yes/No]:");
	String option = sc.next();
	if(option.equalsIgnoreCase("No"))
	{
		break;
	}
}
	pst.executeBatch();
	System.out.println("Records inserted Successfully");
	con.close();
}

}