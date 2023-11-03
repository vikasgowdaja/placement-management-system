package array;

import java.util.Scanner;

public class specificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the value want to search");
		int value=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==value)
			{
				count=1;
			}
		}
		if(count==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not");
		}
	}
}
