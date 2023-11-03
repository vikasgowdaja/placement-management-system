package day5;

class AnimalN1 {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Cat1 extends AnimalN1 {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

class PersianCat extends Cat {
    @Override
    public void makeSound() {
        System.out.println("Persian cat is purring.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        PersianCat persianCat = new PersianCat();
        persianCat.makeSound();
    }
}
