package com.sunbeam;

class Fraction implements Comparable<Fraction>{
	private int n,d; 
	public Fraction(int i, int j) {
		this.n = i; 
		this.d = j; 
	}
	private double value() {
		return (double)n/d;  
	}
	@Override
	public int compareTo(Fraction o) {
		 if(this.value() == o.value())
			 return 0; 
		if(this.value() > o.value())
			return 1; 
		else 
			return -1;  
	}
}

public class Program02 {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(10,2);
		Fraction f2 = new Fraction(20,2);
		int diff = f1.compareTo(f2); 
		//System.out.println("diff --- "+diff);
		
		//diff = f1.compareTo("9/3"); //Compiler error  
		
		
	}
	

}
