package Test;

interface IamInterface
{
void honey_func(int x,int y);
default void default_sugar()
{
System.out.println("This is default method");
}
}
class Main
{
public static void main(String args[]) {
IamInterface obj =(int x, int y)->System.out.println(x+y);
System.out.print ("Our result = ");
obj.honey_func(5,5);
obj.default_sugar();
}
}