package First;

import java.util.Scanner;

public class RearrangeNumber {
public static int rearrange (int a) {
int b=0;
for (int i=9;i>=0;i--) {
int c=a;
while (c>0)
{
int d=c%10;
if (d==i) {
	

b=(b*10)+d;}
c/=10;
}
}
return b;
}

public static void main(String[] args) {
Scanner sc=new Scanner (System.in) ;
int n=sc.nextInt ();
int[] arr= new int[n];
for(int i=0; i<n; i++) arr[i]=sc.nextInt();
int x=0;
for(int i=0; i<n; i++) {
if(arr[i] == rearrange (arr[i])) x++;
}
System.out.println(x);
}
}
