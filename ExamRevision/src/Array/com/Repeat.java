package Array.com;
import java.util.Scanner;
public class Repeat {public static void main (String []args){
	int max,n;
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the number of elements");
	n=sc.nextInt();
	System.out.println("Enter the Elements of Array");
	int arr[]=new int[n];
	for (int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	max=arr[0];
	for(int i=0;i<n;i++) {
	
		if(max<arr[i]) {
			max=arr[i];
			
		}
	}
	System.out.println("Maximum Value:"+max);
}

}
