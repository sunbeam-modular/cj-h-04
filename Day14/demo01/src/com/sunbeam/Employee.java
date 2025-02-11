package com.sunbeam;

import java.util.Objects;

public class Employee {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-10d %10.2f",this.name,this.empid,this.salary);  
	}
	
	
}
