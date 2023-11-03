package Revision;

import java.util.Vector;

public class t {
public static void main(String[] args) {
	Vector v1 = new Vector(7, 3);
	for(int num = 1;num<=15;num++)
	v1.add(num);
	System.out.println(v1.capacity());
}
}
