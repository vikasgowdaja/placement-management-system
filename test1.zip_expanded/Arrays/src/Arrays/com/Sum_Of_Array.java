package Arrays.com;

import java.util.Scanner;

public class Sum_Of_Array {public static void main(String[] args) {
	
	int n,sum;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number of the elements:");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of the Array:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	sum=0;
	for(int i=0;i<n;i++) {
		if (i<n) {
			sum+=arr[i];
		}
	}
	
System.out.println("Sum of the Array:"+sum/n);
}
}