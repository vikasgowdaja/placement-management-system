package array;

import java.util.Scanner;

public class updateElement {

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
		System.out.println("enter the poition value to be add");
		int index=sc.nextInt();
		System.out.println("enter the value ");
		int value=sc.nextInt();
		
	//int value=0;
	arr[index]=value;	
	
	//arr[index-1]=value;
		for(int i=0;i<n;i++)
		{
		
			System.out.println(arr[i]);
	
		}
		
	}

}
