package Quiz_3;

class Base {
final public void show() {
System.out.println("Base:show() called");
}
}
class Derived extends Base{
public void show() {
System.out.println("Derived::show0 called");
}
}
class Main{
public static void main(String[] args) {
Base b= new Derived();
b.show();
}
}