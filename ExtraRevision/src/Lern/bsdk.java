package Lern;

class PrintValue
{
<t> void display(t obj[])
{
for(t i:obj)
{
System.out.println(i+" " );
}
}
}
public class bsdk {
public static void main(String...args)
{
Abc obj1=new Abc();

Integer i[]= {1,2};
obj1.display(i);

Double d[]= {1.1,2.2};
obj1.display(d);
}
}
