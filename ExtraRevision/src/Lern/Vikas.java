package Lern;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Vikas {
public static void main(String[]a)
{
Collection<Integer> collection = new HashSet<Integer>();
collection.add(3);
collection.add(1);
collection.add(2); {

Set<Integer> treeSet=new TreeSet<Integer>(collection);
System.out.println(treeSet);

}
}
}
