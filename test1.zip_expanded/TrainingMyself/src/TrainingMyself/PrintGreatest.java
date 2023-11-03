package TrainingMyself;
import java.util.Scanner;

public class PrintGreatest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float a;
		float b;
		System.out.print("Enter the first value");
		a=sc.nextFloat();
		System.out.print("Enter the Second value");
		b=sc.nextFloat();
		if (a>b) {
			System.out.println(a+" is Greate than "+b);
		}
		else if (b>a)
		{ System.out.println(b+" is Greater than "+a);
		}
	}
}
