package day12;

@FunctionalInterface
interface Prob {
	void show();
}

class Solu implements Prob {
	public void show() {
		System.out.println("in Show");
	}
}

public class Demo {
	public static void main(String[] args) {
//		Prob obj = new Prob() {
//			public void show() {
//				System.out.println("Hello Show");
//			}
//
//		};
		Prob obj = ()-> System.out.println("Hello Show");

		obj.show();
	}

}