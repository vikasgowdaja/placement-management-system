package string;

import java.util.Scanner;

public class addString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enther the string 1"); 
		String s1=sc.nextLine();
		System.out.println("enter the string s2");
		String s2=sc.nextLine();
		System.out.println(s1+s2);
		int n=Integer.parseInt(s1);
		int n1=Integer.parseInt(s2);
		System.out.println(n+n1);
      }
}