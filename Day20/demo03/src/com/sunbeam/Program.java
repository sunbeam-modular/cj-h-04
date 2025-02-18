package com.sunbeam;
class Outer{
	
  // local class -- declared inside method
  // local class in static method -- behaves like static member class
  // object can be created without object of outer class.
  // can access static members of outer class directly or with ClassName. 
	static int outerfield1 = 10;
	int outerfield2 = 20;
	static int field = 30; 
	
	static class Inner{
		static int innerfield1 = 40; 
		int innerfield2 = 50; 
		static int field = 60; 
		
		public void display( ) {
			//System.out.println("outerfield1 : "+outerfield1);
			//System.out.println("outerfield2 : "+outerfield2); // NOT OK
			//System.out.println("field : "+field); // OK ( static) 
			
			//System.out.println("field : "+Outer.field); // OK ( static)
			
			System.out.println("innerfield1 : "+innerfield1); // 40 
			System.out.println("innerfield2 : "+innerfield2); // 50 
			System.out.println("field : "+field); // 60 
		}
	}
}
public class Program {

	public static void main(String[] args) {
		Outer.Inner inobj = new Outer.Inner(); 
		inobj.display();

	}

}
