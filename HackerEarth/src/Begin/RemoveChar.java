package Begin;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println(charRemoveAt(str, 7));
	}
	public static String charRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p + 1);
	}
}
