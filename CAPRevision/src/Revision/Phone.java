package Revision;

class Phone implements Cloneable{
public static void main(String[]args) {
Phone p =new Phone();
if (p instanceof Object)
System.out.println("Object");
if (p instanceof Cloneable)
System.out.println("Cloneable");
}
}