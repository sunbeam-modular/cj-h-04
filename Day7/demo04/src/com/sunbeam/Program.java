package com.sunbeam;
class Person{
	String name; 
	int age; 
	public Person() {
		 this.name = ""; 
		 this.age = 0; 
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
class Employee extends Person{
	int empid; 
	float salary; 
	
	public Employee() {
		this.empid = 0; 
		this.salary = 0.0f; 
	}

	public Employee(String name, int age, int empid, float salary) {
		super(name,age); 
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord( ) {
		super.showRecord(); 
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
	
	
}
public class Program {
	
	public static void main(String[] args) {
		Person p = new Person("Aditya", 31); 
		Employee e = (Employee) p; //ClassCastException ( no upcasting ) 
	}
	public static void main7(String[] args) {
		Person p = new Employee("Aditya", 31, 1, 10000.00f); // upcasting 
		//System.out.println("Name :" +p.name); // OK 
		//System.out.println("Age : "+p.age); // OK
		//System.out.println("Empid :" +p.empid); // NOT OK 
		//System.out.println("Salary : "+p.salary);// NOT OK 
		Employee e = (Employee) p; //downcasting 
		System.out.println("Name : "+e.name);
		System.out.println("Age :" +e.age);
		System.out.println("Empid :" +e.empid);
		System.out.println("Salary : "+e.salary);
	}
	public static void main6(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 1000.00f);
		//System.out.println("Name : "+e.name);
		//System.out.println("Age :" +e.age);
		//System.out.println("Empid :" +e.empid);
		//System.out.println("Salary : "+e.salary);
		Person p = e; // upcasting 
		//System.out.println("Name :" +p.name); // OK 
		//System.out.println("Age : "+p.age); // OK 
		//System.out.println("Empid : "+p.empid); // NOT OK
		//System.out.println("Salary : "+p.salary); // NOT OK
		e = (Employee) p; 
		System.out.println("Name : "+e.name);
		System.out.println("Age :" +e.age);
		System.out.println("Empid :" +e.empid);
		System.out.println("Salary : "+e.salary);
	}
	public static void main5(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 1000.00f); 
		//System.out.println("Name : "+e.name);
		//System.out.println("Age :" +e.age);
		//System.out.println("Empid :" +e.empid);
		//System.out.println("Salary : "+e.salary);
		//Person p =(Person)e; // upcasting 
		Person p = e; // upcasting
		System.out.println("Name :" +p.name); // OK 
		System.out.println("Age : "+p.age); // OK 
		//System.out.println("Empid : "+p.empid); // NOT OK
		//System.out.println("Salary : "+p.salary); // NOT OK
	}
	public static void main4(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 10000.00f);
		System.out.println("Name : "+e.name);
		System.out.println("Age :" +e.age);
		System.out.println("Empid :" +e.empid);
		System.out.println("Salary : "+e.salary);
	}
	public static void main3(String[] args) {
		Employee e = new Employee(); 
		System.out.println("Name : "+e.name);
		System.out.println("Age :" +e.age);
		System.out.println("Empid :" +e.empid);
		System.out.println("Salary : "+e.salary);
	}
	public static void main2(String[] args) {
		Person p =new Person("Aditya", 31); 
		System.out.println("Name :" +p.name);
		System.out.println("Age :" +p.age);
		//System.out.println("Empid :" +p.empid); // NOT OK 
		//System.out.println("Salary : "+p.salary);// NOT OK 
	}
	public static void main1(String[] args) {
		Person p = new Person(); 
		//p.showRecord();
		System.out.println("Name :" +p.name);
		System.out.println("Age :" +p.age);

	}

}
