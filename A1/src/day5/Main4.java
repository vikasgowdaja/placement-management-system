package day5;

class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main4 {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        
        int sum1 = mathUtils.add(2, 3);
        double sum2 = mathUtils.add(2.5, 3.7);
        
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
    }
}
