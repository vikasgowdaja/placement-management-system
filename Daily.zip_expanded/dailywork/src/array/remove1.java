package array;

import java.util.Scanner;

public class remove1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the poition value to be delete");
int match=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(arr[i]==match)
	{
		continue;
	}
	System.out.println(arr[i]);
}
	}

}
