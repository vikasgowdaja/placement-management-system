package StringTrail;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st Word:");
		String x=sc.nextLine();
		System.out.println("Enter the 2nd Word:");
		String y=sc.nextLine();
		if (x.length()==y.length()) {
			
		
		char a[]= x.toCharArray();
		char b[]= y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result =Arrays.equals(a,b);
		
	if (result == true)
	{
		System.out.println("Strings are Anagram");
	}
	else
	{ System.out.println("Strings are not Anagram");
	}
		}
		else {
			System.out.println("String is not a Anagram");
		}
	}
}

