package com.codingwithvikas.inheritence;

public class Dog extends Animal {
	private int breed;
	
	public void eat() {
		System.out.println("BOW BOW");
	}
	public void eat (int numberOfTimes) {
		for(int i=0;i<numberOfTimes;i++) {
		System.out.println("bow bow");}
		
	}

	public int getBreed() {
		return breed;
	}

	public void setBreed(int breed) {
		this.breed = breed;

	}
}