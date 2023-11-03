package Array.com;
import java.util.*;
public class GFG{

static void print2largest(int arr[], int arr_size)
{
	int i, first, second;
	int largest = second = Integer.MIN_VALUE;
	for(i = 0; i < arr_size; i++)
	{
		largest = Math.max(largest, arr[i]);
	}
	for(i = 0; i < arr_size; i++)
	{
		if (arr[i] != largest)
			second = Math.max(second, arr[i]);
	}
	if (second == Integer.MIN_VALUE)
		System.out.printf("There is no second " +
						"largest element\n");
	else
		System.out.printf("The second largest " +
						"element is %d\n", second);
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i]= sc.nextInt();
}
	print2largest(arr, n);
}
}