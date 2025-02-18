package com.sunbeam;

class Outer {
	// local class in non-static method -- behaves like non-static member class
	// object can be created only with object of outer class.
	// can access static members of outer class directly or with ClassName.
	// can access non-static members of outer class directly (this) or "Outer.this".
	static int outerfield1 = 10;
	int outerfield2 = 20;
	static int field = 30;
	int field2 = 40; 

	class Inner {
		final static int innerfield1 = 40;
		int innerfield2 = 50;
		final static int field = 60;  
		int field2 = 90;
		
		public void display() {
			System.out.println("outerfield1 : "+outerfield1); //10 
			System.out.println("outerfield2 : "+outerfield2);//20
			System.out.println("Field : "+field);//60
			
			System.out.println("Field : "+Outer.field);//30
			System.out.println("Field : "+field2);//90
			System.out.println("Field : "+Outer.this.field2);//40
			
		}
	}
}

public class Program {

	public static void main(String[] args) {
		//Outer.Inner inobj = new Outer.Inner(); // NOT OK 
		Outer outObj = new Outer(); 
		Outer.Inner inObj = outObj.new Inner(); 
		inObj.display();
		

	}

}
