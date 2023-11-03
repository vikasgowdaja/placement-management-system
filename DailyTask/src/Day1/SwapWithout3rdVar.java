package Day1;

public class SwapWithout3rdVar {
	public static void main(String[] args) {
		int x=5;
		int y=10;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping:"+ " x= "+x+" "+"y= "+y);
	}

}
