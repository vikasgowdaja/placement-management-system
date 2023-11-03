package com.Vikas;

public class Rowwise {

static void traverse(int a[][])
{
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+ " ");
		}
	}
}

public static void main(String[] args) {
	int a[][]= {{1,4,6,8},{2,4,6,7},{7,8,5,1}};
	
	traverse(a);

}
}
