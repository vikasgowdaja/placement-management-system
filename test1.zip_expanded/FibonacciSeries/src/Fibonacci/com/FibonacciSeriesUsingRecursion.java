package Fibonacci.com;

public class FibonacciSeriesUsingRecursion {
	public static long fibonacci(long number) {
		if ((number==0)||(number ==1)) return number;
		else return fibonacci(number -1)+fibonacci(number-2);
		}
	public static void main(String[] args) {
		for (int counter =0; counter <=10;counter++) {
			System.out.println(" "+fibonacci(counter));
		}
	}

}
