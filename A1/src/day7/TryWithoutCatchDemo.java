package day7;

public class TryWithoutCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } finally {
            System.out.println("Finally block executed even if there's no catch.");
        }
    }
}