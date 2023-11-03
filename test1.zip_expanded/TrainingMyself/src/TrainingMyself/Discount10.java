package TrainingMyself;

import java.util.Scanner;

public class Discount10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int n1;
		float p;
		int t=1000;
		System.out.print("Enter the Amount of Purchase");
		p=sc.nextFloat();
		if (p > t) {
			System.out.print("u are eligible for Discount of 10% of " +10+"% on " + p);
			System.out.println("Dicount of " +" Rupees "+p/10 );
		}

		else {
			System.out.print("u are not eligible for Discount");
		}

	}
}
