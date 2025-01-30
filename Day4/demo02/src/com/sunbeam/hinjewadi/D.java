package com.sunbeam.hinjewadi;

import com.sunbeam.karad.A;

public class D extends A {
	public void test() {
		//System.out.println(a);// NOT OK 
		//System.out.println(b); // NOT OK 
		System.out.println(c); // OK 
		System.out.println(d); //OK 
	}
}

class E {
	public void test() {
		A a1 = new A( ); 
		//System.out.println(a1.a); // NOT OK 
		//System.out.println(a1.b); // NOT OK 
		//System.out.println(a1.c); // NOT OK 
		System.out.println(a1.d); // OK 
	}
}
