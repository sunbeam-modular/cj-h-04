package com.sunbeam;

public class Person implements Cloneable {
	private String name; 
	private int weight , height; 
	private Date birth;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int weight, int height, Date birth) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.birth = (Date) this.birth.clone(); 
		return temp; 
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + ", birth=" + birth + "]";
	}
	
	
}
