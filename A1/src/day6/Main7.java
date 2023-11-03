package day6;

interface Flyable1 {
	void fly();
}

class Bird1 implements Flyable1 {
	public void fly() {
		System.out.println("Bird is flying.");
	}
}

class Airplane1 implements Flyable {
	public void fly() {
        System.out.println("Airplane is flying.");
    }
}

public class Main7 {
	public static void main(String[] args) {
		Bird1 bird = new Bird1();
		Airplane1 airplane = new Airplane1();

		bird.fly();
		airplane.fly();
	}
}