package TrainingMyself;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float l;
		float b;
		System.out.println("Enter the Value of length and breadth ");
		l = sc.nextFloat();
		b = sc.nextFloat();
		if(l==b)
		{System.out.println("Give figure is Square ");
		}
		else {
			System.out.println("Given figure is Rectangle");
		}
	}

}
