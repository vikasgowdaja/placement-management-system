package day6;

class Example {
    public int publicVar;
    private int privateVar;
    int defaultVar;
    protected int protectedVar;

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Example example = new Example();

        // Accessing public members
        example.publicVar = 10;
        example.publicMethod();

        // Accessing private members - not possible outside the class
        // example.privateVar = 20;
        // example.privateMethod();

        // Accessing default members within the same package
        example.defaultVar = 30;
        example.defaultMethod();

        // Accessing protected members within the same package
        example.protectedVar = 40;
        example.protectedMethod();
    }
}