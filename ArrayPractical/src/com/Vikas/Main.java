package com.Vikas;


import java.util.*;
public class Main {
  public static void main(String[] args) {
    int []arr= {1,9,3,5,4,6,2,8};
     Queue<Integer> q= new LinkedList<>();
     for(int i=0;i<arr.length;i++){
       q.add(arr[i]);
     }
     int count=0;
     int mid=arr.length/2;
     while(!q.isEmpty()){
       count++;
       if(mid==count){
         System.out.println("Middle elemnt is: "+q.peek());
       }
       if(q.poll()==5){
         System.out.println("inedex of 5 is: "+count );
       }
       }
  }
}