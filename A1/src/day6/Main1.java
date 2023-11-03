package day6;

	abstract class Shape {
	    public abstract double calculateArea();
	}
	
	class Circle extends Shape {
	    private double radius;
	
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	   
	}
	
	class Rectangle extends Shape {
	    private double width;
	    private double height;
	
	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	
	    public double calculateArea() {
	        return width * height;
	    }
	}
	
	public class Main1 {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(3, 4);
	
	        System.out.println("Circle area: " + circle.calculateArea());
	        System.out.println("Rectangle area: " + rectangle.calculateArea());
	    }
	}