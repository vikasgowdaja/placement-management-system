
package day4;

class Car {
    String brand;
    String model;
    int year;

    Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();

       
        Car car12 =new Car ("Ferrari","Hold",2023);
        car12.display();
        
    }
}