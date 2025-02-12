package com.sunbeam;

public class Rectangle implements Shape {
	private double length, breadth;
	public Rectangle() {
	}
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double calcArea() {
		return this.length * this.breadth;
	}
}
