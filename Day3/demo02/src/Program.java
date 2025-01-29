import java.util.Scanner;

class Employee{
	//Fields 
	private String name; //Instance variable 
	private int empid; //Instance variable
	private float salary; //Instance variable
	
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		name = sc.nextLine(); 
		System.out.print("Empid : ");
		empid = sc.nextInt(); 
		System.out.println("Salary : ");
		salary = sc.nextFloat(); 
	}
	public void printRecord( ) {
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
}
public class Program {
	
	public static void main(String[] args) {
		//Employee emp1 = new Employee(); // Instantiation 
		new Employee(); //Anonymous instance 
	}
	public static void main3(String[] args) {
		Employee emp1 = new Employee(); 
		emp1.acceptRecord(); 
		emp1.printRecord(); 
		
		Employee emp2 = new Employee(); 
		emp2.acceptRecord(); 
		emp2.printRecord(); 
		
		Employee emp3 = new Employee(); 
		emp3.acceptRecord(); 
		emp3.printRecord(); 
		
	}
	public static void main2(String[] args) {
		Employee emp; // Object reference 
		emp = new Employee(); // Instance
		emp.acceptRecord(); 
		emp.printRecord(); 
	}
	public static void main1(String[] args) {
		Employee emp = new Employee(); // Instantiation 
		//emp : Object reference 
		//new Employee() : Instance 
		emp.acceptRecord(); 
		emp.printRecord(); 

	}

}
