package array;

import java.util.Scanner;

public class secondLarge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elements ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int large=0;
		int secLarge=0;
		for(int i=0;i<n;i++)
		{
			if(large<arr[i])
			{
				secLarge=large;
				large=arr[i];
				
			}
			else if(secLarge<arr[i])
			{
				secLarge=arr[i];
			}
		}
		
System.out.println(secLarge);
	}

}
