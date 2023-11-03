package TrainingMyself;
import java.io.*;
import java.util.*;
//import java.util.Map;
//import java.util.HashMap;
public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System. in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		System.out.println ("index"+ i+ "value"+arr[i]);
	}
}
}