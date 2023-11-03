package com.Vikas;

import java.util.Random;

public class UserInput {
	public static void main(String[] args) {
		int[]array = new int[] { 3, 5, 2, 5, 14, 4 };
		int firstItem= array[0];
		int lastItem=array[array.length-1];
		int anyValue = array[new Random().nextInt(array.length)];
		System.out.println(anyValue);
		}
	
	}

