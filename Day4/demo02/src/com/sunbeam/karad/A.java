package com.sunbeam.karad;

public class A {
	private int a; 
	int b; 
	protected int c; 
	public int d; 
}

class B extends A{
	public void test() {
		//System.out.println(a);// NOT OK 
		System.out.println(b); // OK 
		System.out.println(c); // OK 
		System.out.println(d); //OK 
	}
}

class C{
	public void test( ) {
		A a1 = new A( ); 
		//System.out.println(a1.a); // NOT OK 
		System.out.println(a1.b); // OK 
		System.out.println(a1.c); // OK 
		System.out.println(a1.d); // OK 
	}
}
