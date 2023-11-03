package sp;
import java.sql.*;
public class StoredProceduresDemo1
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/demovikas";
	String user="root";
	String pwd="Vikas@998";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	CallableStatement cst=con.prepareCall("{call addProc(?,?,?)}");
	cst.setInt(1,100);
	cst.setInt(2,200);
	cst.registerOutParameter(3,Types.INTEGER);
	cst.execute();
	System.out.println("Result.."+cst.getInt(3));
	con.close();	
}

}