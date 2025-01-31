package com.sunbeam;

public class Program {
	public static void swap(int x[]) {
		int t = x[0];
		x[0] = x[1];
		x[1] = t;
		System.out.println("x[0] = " + x[0] + ", x[1] = " + x[1]); // x[0] = 20, x[1] = 10
	}
	public static void main(String[] args) {
		int a[] = { 10, 20 };
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]); // a[0] = 10, a[1] = 20
		swap(a);
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]); // a[0] = 20, a[1] = 10
	}
}

/*
public class Program04 {
	public static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
		System.out.println("x = " + x + ", y = " + y); // x = 20, y = 10
	}
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a = " + a + ", b = " + b); // a = 10, b = 20
		swap(a, b);
		System.out.println("a = " + a + ", b = " + b); // a = 10, b = 20
	}
}
*/
