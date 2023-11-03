package string;

import java.util.Scanner;

public class maxAccuringChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				count++;
			}
		}
System.out.println(count);

}
}