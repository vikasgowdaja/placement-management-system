package Revision;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Base
{
public void amethod()throws FileNotFoundException{}
}
public class ExcepDemo extends Base
{
public static void main (String args[])
{
ExcepDemo e = new ExcepDemo();
}
public void amethod()
{}
protected ExcepDemo()
{
try
{
DataInputStream din = new
DataInputStream(System.in);
System.out.println("Pausing");
din.readByte();
System.out.println("Continuing");
this.amethod();
}

catch(IOException ioe)
{}
}
}