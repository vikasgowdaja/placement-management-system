package day6;

abstract class Vehicle {
    public abstract void start();
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    public void start() {
        System.out.println("Motorcycle started.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.start();
        motorcycle.start();
    }
}
