package com.Vikas;

public class sort {
	
	static void insertionSort(int a[])
	{
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int current=a[i];
			int j=i-1;
			while(j>=0 && current<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
	}
	static void display(int a[])
	{   int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[]=new int[]{1,4,3,5,2};
		System.out.println("Before sorting:-");
		display(a);
		insertionSort(a);
		System.out.println("After sorting:-");
		display(a);
	}
}

	