package string;

import java.util.Scanner;

public class checkLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the string");
		String s1=sc.nextLine();
		//boolean s2=false;
		 boolean fo=false;
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)=='e')
		{
		fo=true;
		}}
		if(fo)
		{
			System.out.println("e is found");
		}
		else
		{
			System.out.println("e is not found");
		}
		
	}

}
