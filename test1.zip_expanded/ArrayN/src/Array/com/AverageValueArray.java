package Array.com;

import java.util.Scanner;

public class AverageValueArray {
public static void main(String[] args) 
 {

			/* Sample code to perform I/O
	         * Use either of these methods for input

			//BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
	        String name = br.readLine();   // Reading input from STDIN
	        System.out.println(name);    // Writing output to STDOUT 

			//Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();   // Reading input from STDIN
	        System.out.println(name);    // Writing output to STDOUT
	        */ 

			//Write your code here 
			
			Scanner sc =new Scanner(System.in);
			int N =sc.nextInt();
			int[] A=new int[3];
			int[] B=new int[3];
			int a=0,b=0;
			for(int i=0;i<3;i++) {
			    A[i]=sc.nextInt();}
			for(int i=0;i<3;i++) {
			B[i]=sc.nextInt();}
			for(int i=0;i<3;i++) {
			if(A[i]>B[i])
			a++;
			else if(A[i]<B[i])
			b++;}
			System.out.println(a+" "+b);
		}
		

	
}  

