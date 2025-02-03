package com.sunbeam;

public class Employee extends Person{
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