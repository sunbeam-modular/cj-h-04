package com.sunbeam;

public class Human {
	private int age , weight; 
	private int height;
	public Human(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	} 
	public Human() {
		// TODO Auto-generated constructor stub
	}
	//getters / setters 
	public void display() {
		System.out.printf("Age : %d , Height : %d , Weight : %d\n",this.age,this.height,this.weight);
	}
	
}
