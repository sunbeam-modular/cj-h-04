package com.sunbeam;
interface Printable{
	 void f1( ); 
	 void f2( ); 
	 void f3( ); 
}
abstract class AbstractPrintable implements Printable{
	@Override
	public void f1() { }
	@Override
	public void f2() {}
	@Override
	public void f3() {}
}
class A extends AbstractPrintable{
	@Override
	public void f1() {
		System.out.println("A.f1()");
	}
}
class B extends AbstractPrintable{
	@Override
	public void f2() {
		System.out.println("B.f2()");
	}
	
}
class C extends AbstractPrintable{
	@Override
	public void f3() {
		System.out.println("C.f3()");
	}
}
public class Program {

	public static void main(String[] args) {
		Printable p = null; 
		p = new A(); // upcasting 
		p.f1();
		p = new B();// upcasting 
		p.f2();
		p = new C(); // upcasting 
		p.f3(); 
	}

}
