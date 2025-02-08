package com.sunbeam;

public class Product2 implements Comparable<Product2> {
	private int id;
	private String name;
	private double price;
	public Product2() {
	}
	public Product2(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product2 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Product2 o) {
		int diff = this.name.compareTo(o.name);
		return diff;
	}
}






