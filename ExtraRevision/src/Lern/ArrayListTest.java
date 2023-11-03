package Lern;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
public static void main(String args[])
{
List<String> arrayList=new ArrayList<String>();

arrayList.add("a");
arrayList.add("b");
arrayList.add("c");

System.out.println();
arrayList.add(1,"d");
System.out.println(arrayList);
}

}