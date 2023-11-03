package Array.com;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int n,sum;
		Scanner s =new Scanner (System.in);
		System.out.println("Enter the number of elements in array:");
		n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter the elements of array:");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		sum=a[0];
		for(int i=1;i<n;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of all elements in array:"+sum);
	}

}
