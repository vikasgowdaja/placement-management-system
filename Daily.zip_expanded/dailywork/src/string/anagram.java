package string;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String s1, s2;
		s1="anand";
		s2="dnana";
		if(s1.length()!=s2.length())
		{
			System.out.println("not an angram");
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
	char s11[]=s1.toCharArray();
	char s22[]=s2.toCharArray();
	Arrays.sort(s11);
	Arrays.sort(s22);
	if(Arrays.equals(s11, s22))
	{
		System.out.println("anagram");
	}
	
	else
	{
		System.out.println("not  anagram");
	}
		

	}

}
