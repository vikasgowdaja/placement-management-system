package New3;

import java.util.Scanner;

//Java program to find sum of numbers from
//1 to N which are divisible by X or Y

public class Main{
	
	// Function to calculate the sum
	// of numbers divisible by X or Y
	public int calculateSum(int N)
	{
		int S1, S2, S3;
	
		S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
		S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;
		S3 = ((N / (3 * 5))) * (2 * (3 * 5)
						+ (N / (3 * 5) - 1) * (3 * 5))/ 2;
	
		return S1 + S2 - S3;
	}
	
	// Driver code
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		
		Main m=new Main();
		System.out.println(m.calculateSum(N));
	
	}
	// This code is contributed by Ryuga
}

