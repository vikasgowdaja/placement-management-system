package day7;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (Exception e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}

