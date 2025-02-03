package com.sunbeam;

class Person{
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
class Employee extends Person{
	//private String name; 
	//private int age; 
	private int empid; 
	private float salary; 
	
	public Employee() {
		this("Aditya", 31, 1, 10000.00f); 
		System.out.println("public Employee()");
	}

	public Employee(String name, int age, int empid, float salary) {
		super(name,age); 
		System.out.println("public Employee(String name, int age, int empid, float salary)");
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord( ) {
		//super.showRecord(); 
		this.showRecord();
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

