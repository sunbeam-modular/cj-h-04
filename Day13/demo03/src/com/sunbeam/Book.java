package com.sunbeam;

public class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String subject;
	private double price;

	public Book() {
	}

	public Book(int id, String name, String subject, double price) {
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", subject=" + subject + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		int diff = Integer.compare(this.id, o.id); 
		return diff;
	}
}
