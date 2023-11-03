package Lern;

import java.util.HashMap;
import java.util.Map;
public class HashMapTest {
public static void main(String args[])
{
Map<Integer,String> hashMap=new HashMap<Integer,String>();
hashMap.put(11,"animesh");
hashMap.put(2,"ayushi");
hashMap.put(7,"renuka");
hashMap.put(9,"shivashish");
hashMap.put(null,"null");
System.out.println(hashMap.size());
System.out.println(hashMap);
}

}
