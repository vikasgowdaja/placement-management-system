package day2;

import java.util.Scanner;

public class DiffOperators {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the First number: ");
	int a = sc.nextInt();
	System.out.println("Enter the Second number: ");
	int b =sc.nextInt();
	  int sum = a+b;
	  int difference =a-b;
	  int product =a*b;
	  int quotient =a/b;
	  int reminder =a%b;
	  System.out.println("Sum of two numbers"+sum);
	  System.out.println("Difference of two numbers"+ difference);
	  System.out.println("Class Strength "+product);
	  System.out.println("Some Value"+quotient);
	  System.out.println("Value "+reminder);
	  
	  
}
	
}
