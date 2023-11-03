package Fibonacci.com;
import java.util.*;
public class LargestFibonacciNumer {

	  public static void main (String[]args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t-->0) {
	            int n = sc.nextInt();
	            int result = largestFibonacciNumber(n);
	            System.out.println(result);
	        }
	        sc.close();
	    }

	    static int largestFibonacciNumber(int n){
	        return 0;
	    }
	}

