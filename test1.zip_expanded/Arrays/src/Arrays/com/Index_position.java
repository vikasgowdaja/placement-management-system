package Arrays.com;

import java.util.Scanner;

public class Index_position {
	public static void main(String[] args) {

		int n, index, position, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the elements:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the Array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value to be searched:");
		value = sc.nextInt();
		index = arr.length;
		position = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == value) {
				index = i;
				position = index + 1;
			}
		}

		System.out.println("Index Value:" + index);
		System.out.println("Position Value:" + position);
	}
}