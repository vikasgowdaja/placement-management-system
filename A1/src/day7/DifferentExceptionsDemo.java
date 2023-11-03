package day7;

public class DifferentExceptionsDemo {
    public static void main(String[] args) {
        try { 
            int[] arr = new int[5];
            arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
            
           
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("My Name is Vikas");
        } 
        System.out.println("My Name is Bhagirat");
    }
}
