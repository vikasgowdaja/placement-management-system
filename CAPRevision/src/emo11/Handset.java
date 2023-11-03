

package emo11;
interface Keys {
String keypad(String region, int keys);
}
public class Handset {
public static void main(String... args){
double price = 0;
String model = null;
Keys varKeys = (region, keys)->
{if (keys >= 32)
return region;
else return "default";};
System.out.println(model + price + varKeys.keypad("AB", 32));
}
}