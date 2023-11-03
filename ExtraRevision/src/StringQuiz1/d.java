package StringQuiz1;

class A{....}

class B extends A{....}

class C extends B{....}

class Test {
	public static void main(String ar[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();
	}
}