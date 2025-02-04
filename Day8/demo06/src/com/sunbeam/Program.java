package com.sunbeam;
abstract class A{
	
	public final void f1( ) { // logically 100% complete 
		System.out.println("A.f1()");
	}
	public void f2( ) {  //partially complete 
		System.out.println("A.f2()");
	}
	 public abstract void f3(); // logically 100% incomplete  
}
class B extends A{
	@Override
	public final void f2() { // logically 100% complete 
		System.out.println("B.f2()");
	}
	@Override
	public void f3() {//partially complete
		System.out.println("B.f3()");
		
	}
}
final class C extends B{
	@Override
	public final void f3() { // logically 100% complete
		System.out.println("C.f3()");
	}
}
public class Program {

	public static void main(String[] args) {
		C obj = new C(); 
		obj.f1();
		obj.f2();
		obj.f3();

	}

}
