package day6;

class Rectangle2 {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2(5, 3);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}