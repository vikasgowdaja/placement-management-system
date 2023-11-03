package day5;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
   
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        circle.draw();
        rectangle.draw();
    }
}