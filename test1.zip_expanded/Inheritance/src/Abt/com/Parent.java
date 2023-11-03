package Abt.com;

abstract public class Parent {
	abstract void show();

	public void run() {
		System.out.println("Running");
	}
}

class child extends Parent {
	void show() {
		System.out.println("System is Running");
	}
}
