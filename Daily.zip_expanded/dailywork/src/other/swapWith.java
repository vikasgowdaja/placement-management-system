package other;

import java.util.Scanner;

public class swapWith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int n1=sc.nextInt();
System.out.println("enter the number2");
int n2=sc.nextInt();
System.out.println("before swapping: "+"n1 :"+n1+" n2 :"+n2);
n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.println("after swapping :"+"n1 :"+n1+" n2 :"+n2);
	}

}
