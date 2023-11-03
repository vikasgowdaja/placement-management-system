package Lern;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
public static void main(String args[])
{
Vector<String> vector= new Vector<String>();
vector.add("1");
vector.add("2");

Iterator<String> iterator=vector.iterator();
while(iterator.hasNext())
{

System.out.println(iterator.next());
}
}
}
