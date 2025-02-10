package com.domain;

public class Employee implements Comparable<Employee> {
	private String name; 
	private int empid; 
	private float salary; 
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%-30s%-20d%10.2f",this.name,this.empid,this.salary); 
	}

	@Override
	public int compareTo(Employee o) {
		int diff = Integer.compare(this.empid,o.empid); 
		return diff; 
	}
	
	
}
