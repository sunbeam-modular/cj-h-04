package com.sunbeam;

import java.util.Comparator;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

// lambda expr = short-hand implementation of SAM (functional interface)
// method ref = short-hand of lambda expr
public class Program02 {
	public static void main(String[] args) {
		//BinaryOperator<Integer> op1 = (x,y) -> Integer.sum(x, y);
		BinaryOperator<Integer> op1 = Integer::sum; 
				// static method of a class --> ClassName.method(arg1, arg2); i.e. static method called on ClassName
		int a = 10, b = 5;
		System.out.println("Result: " + op1.apply(a, b)); // 15
		
		//Comparator<String> cmp1 = (x,y) -> x.compareTo(y);
		Comparator<String> cmp1 = String::compareTo; 
				// non-static method of a class --> arg1.method(arg2); i.e. non-static method called on arg1
		String s1 = "Sunbeam", s2 = "SunBeam";
		System.out.println("Result: " + cmp1.compare(s1, s2)); // 32 ('b' - 'B')
		
		//Consumer<Double> c1 = d -> System.out.println(d);
		Consumer<Double> c1 = System.out::println;
				// non-static method to call on obj --> obj.method(arg); i.e. non-static method called on given object
		Double v = 3.142;
		c1.accept(v);
	
		//Supplier<Date> supp1 = () -> new Date();
		Supplier<Date> supp1 = Date::new;
				// param-less constructor is called after creating object of given class.
		System.out.println("Current Date: " + supp1.get());
	}
}








