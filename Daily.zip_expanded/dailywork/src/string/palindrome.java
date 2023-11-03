package string;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String s1,s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String 1");
	s1=sc.nextLine();
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not");
	}
	

	
	
	}}
