package DuplicateLists.com;

import java.io.*;

class GFG{

// Function to return maximum diagonal
// sum that are parallel to main diagonal
static int maxDiagonalSum(int arr[][], int N)
{
	
	// Initialize maxSum
	int maxSum = 0;

	// Traverse through the columns
	for(int i = 0; i < N; i++)
	{
		
		// Initialize r and c
		int row = 0, col = i;

		// Diagonal sums
		int sum1 = 0, sum2 = 0;
		while (col < N && row < N)
		{
			sum1 += arr[row][col];
			sum2 += arr[col][row];
			row++;
			col++;
		}

		// Update maxSum with
		// the maximum sum
		maxSum = Math.max(maxSum,
						Math.max(sum1,
								sum2));
	}

	// Return the maxSum
	return maxSum;
}

// Driver code
public static void main (String[] args)
{
	
	// Given matrix mat[][]
	int mat[][] = { { 1, 2, 5, 7 },
					{ 2, 6, 7, 3 },
					{ 12, 3, 2, 4 },
					{ 3, 6, 9, 4 } };
	int N = mat.length;

	// Function Call
	System.out.println(maxDiagonalSum(mat, N));
}
}

// This code is contributed by math_lover
