package annotaionsDemo;

import java.util.ArrayList;

@FunctionalInterface
interface Abc{
	void show();
	
}
class A {
	public void showMyDataFromLastYearDatabase(){
		System.out.println("in A");
	}
}
class B extends A{
	@Override
	@SuppressWarnings("unchecked")
	public void showMyDataFromLastYearDatabase() {
		ArrayList<Integer> obj =new ArrayList<>();
		System.out.println("in B");
		
	}
}
public class AnnoDemo {

	public static void main(String[] args) {
		
	}

}
  