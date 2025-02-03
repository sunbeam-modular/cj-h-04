package com.sunbeam;

public class Person{
	private String name; 
	private int age; 
	public Person() {
		 System.out.println("public Person()");
	}
	public Person(String name, int age) {
		System.out.println("public Person(String name, int age)");
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
}