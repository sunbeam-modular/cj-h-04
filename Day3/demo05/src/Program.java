import java.util.Scanner;

class Employee {
	// Fields
	private String name; // Instance variable
	private int empid; // Instance variable
	float salary; // Instance variable

	// this = emp1
	// setter / mutator
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	// getter / inspector
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class EmployeeTest {
	Employee emp = new Employee();

	// this = emp1
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		emp.setName(sc.nextLine());
		System.out.print("Empid : ");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary : ");
		emp.setSalary(sc.nextFloat());
	}

	public void printRecord() {
		System.out.println("Name : " + emp.getName());
		System.out.println("Empid : " + emp.getEmpid());
		System.out.println("Salary : " + emp.getSalary());
	}
}

public class Program {

	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		emp.acceptRecord();
		emp.printRecord();
	}

}
