package array;

import java.util.Arrays;
import java.util.Scanner;

public class minNumber {

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
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
			//System.out.println(arr[n-1]);
			
			
			
			
			
			
//			int max=0;
//			for(int i=0;i<n;i++)
//			{
//				if(max<arr[i])
//				{
//					max=arr[i];
//				}
//				
//			}
//			System.out.println(max);
	}

}
