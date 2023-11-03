package day2;

import java.util.Scanner;

public class AdditionWithoutPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();

		int sum1 = a - (-b);

		int sum2 = Math.addExact(a, b);

		while (b != 0) {
			int carry = a & b; // Calculate the carry
			a = a ^ b; // Perform XOR operation
			b = carry << 1; // Shift the carry to the left

			// Method 4: Using Java streams
			int sum4 = java.util.stream.IntStream.of(a, b).sum();

			System.out.println("Sum 1: " + sum1);
			System.out.println("Sum 2: " + sum2);

			System.out.println("Sum 3: " + sum4);
		}
		System.out.println("Sum 4: " + a);
	}
}
