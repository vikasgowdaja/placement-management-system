package com.codingwithvikas.inheritence;

public class Cat extends Animal{
	private String litterpreference;

	public void eat() {
		System.out.println("mow mow");
	}
	public String getLitterpreference() {
		return litterpreference;
	}

	public void setLitterpreference(String litterpreference) {
		this.litterpreference = litterpreference;
	}
	

	


}
