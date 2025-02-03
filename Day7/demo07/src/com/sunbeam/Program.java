package com.sunbeam;

import java.util.Scanner;

class Shape {
	protected float area;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public float getArea() {
		return area;
	}

	public void calculateArea() {
		// TODO
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	
}

class Rectangle extends Shape {
	private float length;
	private float breadth;

	public void setLength(float length) {
		this.length = length;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}

}

class Circle extends Shape {
	private float radius;

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		this.area = (float) (Math.PI * this.radius * this.radius);
	}

}

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter the choice  ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void acceptRecord(Shape shape) {
		if (shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape; // downcasting
			System.out.print("Length : ");
			rect.setLength(sc.nextFloat());
			System.out.print("Breadth : ");
			rect.setBreadth(sc.nextFloat());
		} else {
			Circle c = (Circle) shape; // downcasting
			System.out.print("Radius : ");
			c.setRadius(sc.nextFloat());
		}
	}

	public static void printRecord(Shape shape) {
		System.out.println("Area : " + shape.getArea());
	}

	public static void main(String[] args) {
		int choice;
		while ((choice = menuList()) != 0) {
			Shape shape = null;
			switch (choice) {
			case 1:
				shape = new Rectangle(); // upcasting
				break;
			case 2:
				shape = new Circle(); // upcasting

			}
			if (shape != null) {
				acceptRecord(shape);
				shape.calculateArea(); // Runtime Polymorphism / Dynamic method dispatch
				printRecord(shape);
			}
		}

	}

}
