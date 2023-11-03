package day5;

class Shape1 {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle1 extends Shape1{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}