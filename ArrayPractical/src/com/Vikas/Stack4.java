package com.Vikas;
public class Stack4 {

static void push(int a[], int size, int top)
{
	System.out.println("Pushing element in stack");
	for(int i=0;i<size;i++)
	{
		if(top==(size-1))
		{
			System.out.println("overflow ");
		}else
		{
			top++;
			a[top]=a[i];
			System.out.print(a[top]+" ");
		}
	}
}
static void pop(int a[], int size, int top)
{
	int mid= ((0+(size-1))/2);
	for(int i=0;i<mid;i++)
	{
		if(top<0)
		{
			System.out.println("underflow ");
		}else
		{
			a[i]=a[top];
			top--;
			System.out.println(a[i]+" ");
		}
	}
}
static void display(int a[], int size)
{
	System.out.println();
	int mid= ((0+(size-1))/2);
	System.out.println("Display traverse of stack");
	for(int i=mid-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
}
public static void main(String[] args) {
	int a[]= new int [] {1,9,3,5,4,6,2,8};
	int size=a.length;
	int top=-1;

	push(a,size,top);
	pop(a,size,top);
	display(a,size); 
}}
