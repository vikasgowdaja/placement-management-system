package Revision;
import java.util.*;
public class MyPancake implements Pancake {
 public static void main(String[] args){
List<String> x = new ArrayList<String>();
x.add("3"); x.add("7"); x.add("5");
 List<String> y = new MyPancake().doStuff(x);
 y.add("1");
 System.out.println(x);
 }

@Override
public List<String> doStuff(List<String> z) {
	z.add("9");
	return z;
}
 
 //  STRING LIST ,   IT CANT BE PROTECTED 
 
//protected List<String> doStuff(List<String>z){
// z.add("9");
//return z;
//}
}

 interface Pancake {
 List<String> doStuff(List<String> s);
}