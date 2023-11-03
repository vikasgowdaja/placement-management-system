package com.Vikas;

public class binaryString {
	 
	static void binarySearch( String a[],int n, String search)
	{
		int start=0;
		int end=n-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==search)
			{
				System.out.println("Index of"+search+" element is "+mid);
				break;
			}
			else if((a[mid]).compareTo(search)>0)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		if(start>end)
		{System.out.println(search+" element is not present in array");
	}}
	public static void main(String[] args) {
		String a[]=new String[] {"Pepsi","Coca-cola","Limka","Fanta","Sprite"};
		String search="Sprite";
		int n=a.length;
		binarySearch(a,n,search);
	}
}