package Lern;

import java.util.ArrayList;
import java.util.List;

public class MyClass1 {
public static void main (String args[])
{
List<Integer> list=new ArrayList<Integer>();
list.add(2);
list.add(3);
System.out.println(sum(list));

}
public static double sum(List<? extends Number> list)
{
double sum=0;
for(Number num:list)
{
sum+=num.doubleValue();
}
return sum;
}
}
