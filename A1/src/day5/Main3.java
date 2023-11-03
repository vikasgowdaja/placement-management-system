package day5;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum1 = calculator.add(2, 3);
        int sum2 = calculator.add(2, 3, 4);
        
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
    }
}
