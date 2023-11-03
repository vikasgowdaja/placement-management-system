package day5;

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car is honking.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.honk();
    }
}