package com.sunbeam;

public class Singleton {
	//static field to hold the single object  
	private static Singleton obj; 
	
	static {
		//static block will be executed only once so only one object will be created 
		obj = new Singleton(); 
	}
	//if constructor is private we cannot create the object outside the class  
	private Singleton() {
		System.out.println("Singleton called");
	}
	//getter method to make obj accessible outside the class 
	public static Singleton getInstance() {
		return obj;
	}
}
