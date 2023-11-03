package array;
import java.util.Scanner;
public class averageValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		float sum = 0,avg=0;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			avg = sum / n;
		}
		System.out.println(avg);
	}
}
