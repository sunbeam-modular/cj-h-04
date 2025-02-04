package com.sunbeam;
interface Printable{
	/*public static final*/int number = 10; 
	/*public abstract*/void print();
	 
}
class Test implements Printable{

	@Override
	public void print() {
		System.out.println("number : "+Printable.number);
	}
	
}
public class Program {

	public static void main(String[] args) {
		Printable p = new Test(); // Polymorphic declaration ( upcasting) 
		p.print();

	}

}
