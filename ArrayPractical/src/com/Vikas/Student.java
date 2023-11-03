package com.Vikas;
public class Student{
	 static int count = 0; int ID; 
	public Student() {
		ID= count; count++;
	}public static void main(String[] args) { Student s1= new Student(); 
	Student s2 = new Student (); Student s3 = new Student();
System.out.println(s1.ID+"" +s2.ID +""+s3.ID); 
System.out.println(s1.count +"" +s2.count + ""+ s3.count);
	}
}