package day2;

import java.util.Scanner;

public class Add2numwithoutPlus {
	public static void main(String[] args) {
		Scanner jk = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int a = jk.nextInt();
		System.out.println("Enter the 2nd num:  ");
		int b=jk.nextInt();
	int sum1= a-(-b);
	while (b != 0) {
		int carry = a & b; 
		a = a ^ b; 
		b = carry << 1;
	int sum3= Integer.sum(a, b);
	System.out.println("Sum1: "+sum1);
	
	System.out.println("Sum3: "+sum3);
	}
	System.out.println("Sum4: "+a);
	}
}
