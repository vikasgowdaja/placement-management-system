package Revision;

class A {
	private void print() {
		System.out.println("Inside A's print method.");
	}

	public void test() 
	{
		this.print();
	}
}

class B extends A {
	private void print()
	{
		System.out.println("Inside B's print method.");
	}

	public static void main(String args[]) {
		A a = new B();
		a.test();
	}
}