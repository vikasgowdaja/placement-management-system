package string;

import java.util.Scanner;

public class toStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strimg");
		String s1=sc.nextLine();
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			//s2[i]=s2[i].replaceAll("[^\\w]","");
			System.out.println("["+i+"] :"+s2[i]);		}
		
	}

}
