
package Arrays.com;
import java.util.Scanner;
public class MaxMin {

public static void main(String[] args) {
	int n,max,min;
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the number of elements:");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of the array:");
	for (int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	max=arr[0];
	min=arr[0];
	for (int i=0;i<n;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}}
		
		for (int j=0;j<n;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
	}
	System.out.println("Maximum value:"+max);
	System.out.println("Minimum value:"+min);
}
}

