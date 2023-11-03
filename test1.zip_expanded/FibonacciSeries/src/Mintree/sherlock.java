package Mintree;

import java.util.Scanner;


public class sherlock {
	static int getSum(int n)
	{   int even_sum=0;
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;//518%10=8
			n = n / 10;//518/10=51
		}
      if(sum%2==0){
         even_sum=sum;
      }
     
		return even_sum;
	}
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
		int even_count=0,count=0;
      int n = sc.nextInt();
      
       for(int i=0;i<=n;i++){
         even_count=getSum(i);
         if(even_count>0)
          count++;
       }
		System.out.println(count+1);
		sc.close();
	}
}