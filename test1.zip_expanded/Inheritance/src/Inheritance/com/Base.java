package Inheritance.com;

class Base {
	public void foo() {
		System.out.println("Base::show( called");
	}
}

//     p               c
class Derived extends Base {
	public void foo() {
		System.out.println("Derived::show() called");
	}
}

class Main {
	public static void main(String[] args) {
		Base b = new Derived();
		b.foo();
	}
}
