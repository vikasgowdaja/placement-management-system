package Lern;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetTest {
public static void main (String args[])
{
Set s=new LinkedHashSet();
s.add("11");
s.add(1);
s.add(3);
s.add(2);
s.add(5);
System.out.println(s);
}
}