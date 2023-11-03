package TrainingMyself;
import java.util.Scanner;
public class Control01 {
public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	System.out.print
	("Enter the number you want to check");
	n = sc.nextInt();
	if (n>0) {
		System.out.println("The given number "+n+" is positive");
	}
		else if (n<0)
		{
			System.out.println("The given number "+n+" is negative");
		}
		else
		{
			System.out.println("The given number "+n+" is Zero");
		}
		}
}

