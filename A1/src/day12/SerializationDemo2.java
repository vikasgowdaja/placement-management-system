package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	String Name;
	int EMPID;
	int number;
	
}
public class SerializationDemo2 {
	public static void main(String[] args) {
		Employee e =new Employee();
		e.Name ="Vikas Gowda J A";
		e.EMPID = 61089296;
		e.number= 267549;
		try {
			FileOutputStream fileOut = new FileOutputStream("d:\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Object is saved in d:\\employee.ser");
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		
		
		//Deserialization
		Employee e2 =null;
		
		try {
			FileInputStream fileIn = new FileInputStream("d:\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e2=(Employee) in.readObject();
		
			in.close();
			fileIn.close();
			System.out.println("Object is saved in d:\\employee.ser");
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+e2.Name);
		System.out.println("EMPID: "+e2.EMPID);
		System.out.println("Number: "+e2.number);
	}
	
}

