package day6;

interface Shape1 {
    double calculateArea();
}

class Circle1 implements Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 implements Shape1 {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5);
        Rectangle1 rectangle = new Rectangle1(3, 4);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}