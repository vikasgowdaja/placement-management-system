package string;

import java.util.Scanner;

public class abbreviations {
	
//      ------ another way----------
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			//System.out.println(ch[0]);
		}
		System.out.println("enter the string");
		String s1=sc.nextLine();
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			//System.out.println(ch1[0]);
		}
		System.out.println("enter the string");
		String s2=sc.nextLine();
		System.out.print(ch[0]+".");
		System.out.print(ch1[0]+".");
		char ch2[]=s2.toCharArray();
		for(int i=0;i<ch2.length;i++)
		{
			
			System.out.print(ch2[i]);
		}

	}

}
