/**
 * 
 */
package day2;

import java.util.Scanner;

/**
 * 
 */
public class BitwiseOperatorsDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b = sc.nextInt();

		int bitwiseAnd = a & b;
		int bitwiseOr = a | b;
		int bitwiseXor = a ^ b;
		int bitwiseComplementA = ~a;
		int leftShift = a << 1;
		int rightShift = a >> 1;

		System.out.println("Bitwise AND: " + bitwiseAnd);
		System.out.println("Bitwise OR: " + bitwiseOr);
		System.out.println("Bitwise XOR: " + bitwiseXor);
		System.out.println("Bitwise Complement of A: " + bitwiseComplementA);
		System.out.println("Left Shift: " + leftShift);
		System.out.println("Right Shift: " + rightShift);
	}
}
