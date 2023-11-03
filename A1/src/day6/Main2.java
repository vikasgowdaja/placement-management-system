package day6;

interface Swimable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Bird extends Swimable, Flyable {
}

class Duck implements Bird {
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public void fly() {
        System.out.println("Duck is flying.");
    }
}
class Bat implements Bird {
    public void swim() {
        System.out.println("Bat is swimming.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Bat bat =new Bat();
        bat.swim();
        duck.swim();
        duck.fly();
    }
}
