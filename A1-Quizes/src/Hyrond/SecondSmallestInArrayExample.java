package Hyrond;


import java.util.*;
public class SecondSmallestInArrayExample{
public  int getSecondSmallest(int[] a ){
int temp;
for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       return a[1];
      
}
public static void main(String args[]){
    int n;
    Scanner sc =new Scanner(System.in);
System.out.println("Enter the number of elements in the array:");
		n=sc.nextInt();
		int []a =new int[n];
		System.out.println("Enter the  elements of the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		// System.out.println("Second smallest:"+a[1]);
		SecondSmallestInArrayExample b=new SecondSmallestInArrayExample();
	b.getSecondSmallest(a);
	System.out.println(a[1]);

}}
