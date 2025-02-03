package com.sunbeam;
class Person{
	private String name; 
	private int age; 
	public Person() {
		this("Aditya", 31); 
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
}
class Employee{
	private String name; 
	private int age; 
	private int empid; 
	private float salary; 
	
	public Employee() {
		this("Aditya", 31, 1, 10000.00f); 
	}

	public Employee(String name, int age, int empid, float salary) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord( ) {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 10000.00f); 
		e.printRecord(); 
	}
	public static void main3(String[] args) {
		Employee e = new Employee(); 
		e.printRecord();
	}
	public static void main2(String[] args) {
		Person p = new Person("Aditya", 31); 
		p.showRecord();
	}
	public static void main1(String[] args) {
		Person p = new Person();  
		p.showRecord();

	}

}
