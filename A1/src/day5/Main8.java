package day5;

class Animal2 {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Cat2 extends Animal2 {
	 @Override
	    public void makeSound() {
	        System.out.println("Cat is meowing.");
	    }
}

class PersianCat1 extends Cat2 {
    @Override
    public void makeSound() {
        System.out.println("Persian cat is purring.");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Cat2 persianCat = new Cat2();
        persianCat.makeSound();
        PersianCat1 cat1 =new PersianCat1();
        cat1.makeSound();
    }
}