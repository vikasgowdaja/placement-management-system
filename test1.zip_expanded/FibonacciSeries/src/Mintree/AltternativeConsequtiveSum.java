package Mintree;

import java.util.Scanner;
public class AltternativeConsequtiveSum {
	public static int count(int x) {
		return (int)(x/2)+1; 
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int x = sc.nextInt();
	  System.out.println(count(x));
	}
}
