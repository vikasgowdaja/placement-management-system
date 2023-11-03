package day7;

public class ErrorsAndExceptionsDemo {
    public static void main(String[] args) {
        // Demonstrating an Error
        try {
            int[] arr = new int[Integer.MAX_VALUE]; // This will throw OutOfMemoryError
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Demonstrating an Exception
        try {
            int num = Integer.parseInt("abc"); // This will throw NumberFormatException
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
