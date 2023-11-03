package other;

import java.util.Scanner;

public class swapWithout {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int n1 = sc.nextInt();
		System.out.println("enter the second number");
		int n2 = sc.nextInt();
		System.out.println("before swapping: " + "n1 :" + n1 + " n2 :" + n2);
		int temp = 0;
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("after swapping " + "n1 :" + n1 + " n2 :" + n2);

	}

}
