package com.Vikas;

import java.util.Scanner;

public class ReverseString {
	 
	    public static void main(String[] args) {    
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("Enter the input:");
	        String string = sc.nextLine();    
	        //Stores the reverse of given string    
	        String reversedStr = "";    
	            
	        //Iterate through the string from last and add each character to variable reversedStr    
	        for(int i = string.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + string.charAt(i);    
	        }    
	            
	        System.out.println( string);    
	   
	        System.out.println( reversedStr);    
	    
	}    
	}  
