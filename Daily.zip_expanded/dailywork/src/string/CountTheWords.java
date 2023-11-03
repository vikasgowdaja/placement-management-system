package string;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		//String s2=s.join(" ","");
		//System.out.println(s2);
		String s1[]=s.split(" ");
		
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!="")
			{
				count++;
				//continue;
			}
			
		}
		System.out.println(count);
	}

	
	}


