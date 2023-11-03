package com.Vikas;

import java.util.Scanner;

public class CountingVowelsConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");

		int vCount = 0;

		String str = sc.nextLine();

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				vCount++;
			}

		}
		System.out.println("Number of vowels: " + vCount);

	}
}
