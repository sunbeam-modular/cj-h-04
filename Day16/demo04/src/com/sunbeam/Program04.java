package com.sunbeam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program04 {
	public static void main(String[] args) throws ClassNotFoundException {
		// get class metadata -- java.lang.Class object
			// String className; --> c = Class.forName(className);
			// given obj; --> c = obj.getClass();
			// class in project; --> c = ClassName.class;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full class name: ");
		String className = sc.next();
		Class<?> c = Class.forName(className);
		// display class metadata
		System.out.println("Name: " + c.getName());
	
		System.out.println("SuperClass: " + c.getSuperclass());
		
		Class<?>[] intfs = c.getInterfaces();
		for (Class<?> intf : intfs)
			System.out.println("Interface: " + intf.getName());
	
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields)
			System.out.println("Field: " + field.toString());
		
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods)
			System.out.println("Method: " + method.toString());
		
		Constructor<?>[] ctors = c.getDeclaredConstructors();
		for (Constructor<?> ctor : ctors)
			System.out.println("Ctor: " + ctor.toString());
	}
}
