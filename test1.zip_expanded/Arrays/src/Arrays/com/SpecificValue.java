package Arrays.com;
import java.util.Scanner;
public class SpecificValue {

public static void main(String[] args) {
	int n,same;
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the number of elements:");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of the array:");
	for (int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	System.out.println("Enter the value to be searched:");
	same=sc.nextInt();
	for (int i=0;i<n;i++) {
		if(same==arr[i]) {
			same=arr[i];
			System.out.println("Found");
		}
		else 
		System.out.println();
	}
	
}
}
