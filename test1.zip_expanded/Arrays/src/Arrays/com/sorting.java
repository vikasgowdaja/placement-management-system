package Arrays.com;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class sorting {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
			
		}
		System.out.println(arr[0] + " " + arr[n - 1]);
	}

}
