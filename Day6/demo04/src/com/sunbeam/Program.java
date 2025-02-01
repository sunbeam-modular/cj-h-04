package com.sunbeam;
class Test{
	private int num1; // instance variable  
	private int num2; // instance variable 
	private static int num3; // class-level variable 
	static { // static intialization block
		System.out.println("static init block");
		Test.num3 = 500; 
	}
	public Test() {
		this(0, 0); 
	}
	public Test(int num1, int num2) {
		System.out.println("Constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	public void printRecord( ) {
		System.out.println("num1 : "+this.num1);
		System.out.println("num2 : "+this.num2);
		System.out.println("num3 : "+Test.num3);
	}
	
}
public class Program {

	public static void main(String[] args) {
		Test t1 = new Test(10, 20); 
		
		t1.printRecord();
		

	}

}
