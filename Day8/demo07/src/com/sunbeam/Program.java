package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		//Can invoke overridden methods in sub-class using 
		//super-class reference -- runtime polymorphism
		Shape rect = new Rectangle(10, 2); //polymorphic - declaration 
		System.out.println("Area : "+rect.calcArea());
		System.out.println("Peri : "+rect.calcPeri());
		
		Shape cir = new Circle(4.1); 
		System.out.println("Area : "+cir.calcArea());
		System.out.println("Peri : "+cir.calcPeri());
		
		Shape s = new Square(5.1); 
		System.out.println("Area : "+s.calcArea());
		System.out.println("Peri : "+s.calcPeri());
	}

}
