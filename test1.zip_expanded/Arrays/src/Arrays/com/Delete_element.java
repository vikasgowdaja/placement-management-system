package Arrays.com;

import java.util.Scanner;

public class Delete_element {

	public static void main(String[] args) {
		int n, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be removed:");
		value = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[i] != value) {
				int[] new_arr = new int[n];

				new_arr[n - 1] = arr[i];
				System.out.println(new_arr[n - 1]);

			}
		}
	}

}
