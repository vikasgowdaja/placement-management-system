package string;

import java.util.Scanner;

public class duplicateChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		char ch[] = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {

					System.out.println(ch[j]);
				}

			}

		}
	}}


