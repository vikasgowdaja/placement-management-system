package day2;

import java.util.Scanner;

public class Operators1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
         int b=sc.nextInt();
         
         
         int sum = a+b;
         int difference=a-b;
         int product=a*b;
         int quotient=a/b;
         int reminder =a%b;
         System.out.println("sum: "+sum);
         System.out.println("difference: "+difference);
         System.out.println("product: "+product);
         System.out.println("quotient: "+quotient);
         System.out.println("reminder: "+reminder);
	}

}
