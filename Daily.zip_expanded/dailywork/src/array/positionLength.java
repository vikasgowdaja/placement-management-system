package array;

import java.util.Scanner;

public class positionLength {

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
		System.out.println("enter the value");
		int find=sc.nextInt();

		int index=0;
		int position=0;
	//	arr[find]=index;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==find)
			{
				index=i;
				position=index+1;
			}
		}
		System.out.println(index);
		System.out.println(position);

	}

}
