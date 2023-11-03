package client.com;

import entities.com.Student;
import service.com.StudentService;
import service.com.StudentServiceIMPL;

public class Client
{
	public static void main(String[] args)
	{
		//Debug this program as Debug -> Debug as Java Application
		
		StudentService service = new StudentServiceIMPL();
		Student student = new Student();
		
		 // Create Operation calling activity
		student.setStudentId(101);
		student.setName("Sachin");
		service.addStudent(student);
		
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(101);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName()); // Sachin
	
		 
		// Update Operation
		student = service.findStudentById(101);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		
		student = service.findStudentById(101);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());  // Sachin Tendulkar
		

		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");  
	

		

	}
}
