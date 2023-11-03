package day6;

class Shape3 {
    private String color;

    public Shape3(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle3 extends Shape3 {
    private double radius;

    public Circle3(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class Main11 {
    public static void main(String[] args) {
        Circle3 circle = new Circle3("Red", 5);
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
    }
}