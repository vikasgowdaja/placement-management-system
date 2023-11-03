package New2;


import java.util.Arrays;
import java.util.Scanner;

public 
class test {
	static int maxModValue(int arr[], int n)
	{
		int ans = 0;

	
		Arrays.sort(arr);

		for (int j = n - 2; j >= 0; --j) {
	
			if (ans >= arr[j])
				break;

			
			if (arr[j] == arr[j + 1])
				continue;

			for (int i = 2 * arr[j]; i <= arr[n - 1] + arr[j]; i += arr[j]) {
				

				int ind = Arrays.binarySearch(arr, i);

				if (ind < 0)
					ind = Math.abs(ind + 1);

				else {
					while (arr[ind] == i) {
						ind--;

						if (ind == 0) {
							ind = -1;
							break;
						}
					}
					ind++;
				}

				
				ans = Math.max(ans, arr[ind - 1] % arr[j]);
			}
		}
		return ans;
	}

	
	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println(maxModValue(arr, arr.length));
	}
}
