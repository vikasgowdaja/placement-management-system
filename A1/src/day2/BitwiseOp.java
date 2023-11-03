package day2;

import java.util.Scanner;

public class BitwiseOp {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the First number: ");
	int a= sc.nextInt();
	System.out.println("Enter the Second number: ");
	int b=sc.nextInt();
	
	int bitwiseAnd=a&b;
	int vikas=a|b;
	int bitwiseXor= a^b;
	int bitwiseC= ~a;
	int c= a<<1;
	int d= a>>1;
	
	System.out.println("bitwiseAnd: "+ bitwiseAnd);
}
}
