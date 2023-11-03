package TrainingMyself;
import java.util.Scanner;
public class CheckEvenOdd {
public static void main(String[] args) {
	int n;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the Value to be Checked ");
	n=s.nextInt();
	if (n%2==0) {System.out.println("Entered Value is Even");
	}
	else 
	{System.out.println("Entered Value is Odd");
	}
	
}
}
