package Lern;

import java.util.*;  
public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();//Creating HashMap    
   map.put(1,8);  //Put elements in Map  
   map.put(2,9);    
   map.put(3,4);   
   map.put(4,3);   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  
