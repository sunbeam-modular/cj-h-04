package com.sunbeam;

import java.util.StringTokenizer;

public class Program {

	public static void main1(String[] args) {
		// String class in Java -- represents immutable "sequence of characters"
		// length() returns number of chars
		// charAt() returns char at given index -- 0 to length()-1
		// "str" reference is created on "stack"
		// "Sunbeam" string literal/constant is created on String pool (in heap)
		String str = "Sunbeam"; 
		System.out.println("Length : "+str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			System.out.print(ch);
		}

	}
	public static void main2(String[] args) {
		//new String objects are created on heap 
		String str = new String("Infotech");
		System.out.println("Length : "+str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			System.out.print(ch);
		}
	}
	public static void main3(String[] args) {
		//indexOf() ,lastIndexOf()
		String str = "Sunbeam Infotech"; 
		char ch = 'e'; 
		int index = str.indexOf(ch); 
		System.out.println(" Char " + ch + " is at index " + index);
		ch = 't';
		index = str.indexOf(ch); 
		System.out.println(" Char " + ch + " is at index " + index);
		ch = 'e'; 
		index = str.lastIndexOf(ch); 
		System.out.println(" Char " + ch + " is at index " + index);
	}
	public static void main4(String[] args) {
		//toUpperCase(), toLowerCase()
		// strings are immutable.
		// operations performed on string will create a new object with modified contents.
		String str = "Sunbeam"; 
		String s1 = str.toUpperCase(); 
		System.out.println("str : "+str);
		System.out.println("s1 : "+s1);
		String s2 = str.toLowerCase(); 
		System.out.println("str : "+str);
		System.out.println("s1 : "+s2);
	}
	public static void main5(String[] args) {
		//concat()
		String s1 = "Sunbeam"; 
		String s2 = "Infotech";
		String str = s1.concat(s2); 
		System.out.println("Str : "+str);
	}
	public static void main6(String[] args) {
		//substring()
		String str ="Sunbeam Infotech"; 
		String s1 = str.substring(7); 
		System.out.println("S1 : "+s1);
		String s2 = str.substring(7, 12); 
		System.out.println("S2 : "+s2);
	}
	public static void main7(String[] args) {
		//split()
		String str = "this is just a example"; 
		String[] parts = str.split(" "); 
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
			
		}
	}
	public static void main8(String[] args) {
		String str = "this is just a example"; 
		StringTokenizer stringTokenizer = new StringTokenizer(str, " "); 
		while(stringTokenizer.hasMoreTokens()) {
			String s = stringTokenizer.nextToken(); 
			System.out.println(s);
		}
	}
	public static void main9(String[] args) {
		//trim() => trim() removes leading and trailing spaces from the string
		String str = "                     Sunbeam Infotech                  "; 
		System.out.println("length : "+str.length());
		String s1 = str.trim(); 
		System.out.println("s1 : "+s1);
		System.out.println("Length : "+s1.length());
	}
	public static void main(String[] args) {
		String str = "Sunbeam Infotech"; 
		int year = 1998; 
		String s = String.format("%s was founded in the year %d",str,year); 
		System.out.println(s);
	}

}
