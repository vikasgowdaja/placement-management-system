package day5;

class  AnimalN {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
    public void sleep() {
        System.out.println("Animal is Sleeping.");
    }
}

class Cat extends AnimalN {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        AnimalN animal = new AnimalN();
        Cat cat = new Cat();
        
        animal.makeSound();
        cat.makeSound();
        cat.sleep();
    }
}
