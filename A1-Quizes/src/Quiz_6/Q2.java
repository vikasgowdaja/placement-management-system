package Quiz_6;

class exception_handling1
{
public static void main (String args[])
{
try
{
System.out.print("Hello"+" " +1/0);
}
catch(ArithmeticException e)
{
System.out.print("World") ;
}
}
}