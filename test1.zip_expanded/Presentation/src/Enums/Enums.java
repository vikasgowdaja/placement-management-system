package Enums;

public class Enums
{
    enum WildCat
    {
        LION, TIGER, PANTHER;
    }
 
    
    public static void main(String[] args)
    {
        WildCat c1 = WildCat.LION;
        System.out.println(c1);
    }
}