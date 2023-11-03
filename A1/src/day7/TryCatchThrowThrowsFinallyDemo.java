package day7;

public class TryCatchThrowThrowsFinallyDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
        	int[] arr = new int[5];
            arr[5] = 10;
            System.out.println("Finally block executed.");
        }
    }
}