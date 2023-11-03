package array;

import java.util.Scanner;

public class remove {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the poition value to be delete");
		int position=sc.nextInt();
	//int value=0;
	//arr[index]=value;	
		for(int i=position;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.println(arr[i]);
	
		}
	}
}
