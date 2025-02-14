package com.sunbeam;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// my application -- v3.0
@Deprecated
class OldClass {
	// my application -- v1.0
	@Deprecated
	public void oldMethod() {
		System.out.println("OldClass.oldMethod()");
	}
	// my application -- v2.0
	public void newMethod() {
		System.out.println("OldClass.newMethod()");
	}
}

public class Program02 {
	/*
	@SuppressWarnings("unused") // suppress unused variable warning for all vars in the method
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unused" }) // suppress warning of raw types (not using generic <>)
		List list = new ArrayList();
		String str = "Hello";
	}
	*/
	/*
	public static void main(String[] args) {
		// v1.0
		OldClass obj1 = new OldClass();
		obj1.oldMethod();
		
		// v2.0
		OldClass obj2 = new OldClass();
		obj2.newMethod();		
	}
	
}

