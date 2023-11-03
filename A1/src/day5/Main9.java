package day5;

abstract class Animal3 {
    public abstract void makeSound();
    
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Cat3 extends Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Cat says Meow.");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Cat3 cat = new Cat3();
        cat.makeSound();
        cat.sleep();
    }
}

