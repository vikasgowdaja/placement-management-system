package day5;

class Animal {
	 public void eat() {
	        System.out.println("Animal is eating.");
	    }
}

class Dog extends Animal{
	public void Sound() {
		System.out.println("Dog is Barking");
	}
}



public class Main {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.eat();
        
    }
}