package Arrays.com;

import java.util.Scanner;

public class insertElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		int arr[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the poition value to be add");
		int pos = sc.nextInt();
		System.out.println("enter the value ");
		int value = sc.nextInt();

		for (int i = n - 1; i >= (pos - 1); i--) {
			arr[i + 1] = arr[i];
		}

		arr[pos - 1] = value;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+",");

		}
		System.out.print(arr[n] );
	}

}
