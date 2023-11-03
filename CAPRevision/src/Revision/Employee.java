package Revision;

import java.util.TreeSet;
public class Employee {
private int empno;
private String name;

public static void main(String args[]){
TreeSet empset = new TreeSet();
empset.add(new Employee());
empset.add(new Employee());
System.out.println("Size: " + empset.size());
}
}