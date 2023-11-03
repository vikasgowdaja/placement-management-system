package Arrays.com;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int arr[] = new int[n+1];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
}
}
}

