package com.Vikas;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word to be searched:");
		a = sc.next();
		
		System.out.println("Enter the Elements:");
		String[] A =  {"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
		int pos = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (a.equals(A[i])) {
				pos = i;
				System.out.println(pos);
			}

		}
	}
}
