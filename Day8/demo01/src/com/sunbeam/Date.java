package com.sunbeam;

public class Date {
	private int day; 
	private int month; 
	private int year; 
	
	public Date() {
		this(1, 1, 2010); 
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//this = d1; 
	//obj = d2 
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
		 return false; 
		if(this == obj)
		   return true; 
		if(!(obj instanceof Date))
			return false; 
		Date other = (Date) obj;
		if(this.getDay() == other.getDay() && this.getMonth() == other.getMonth() && this.getYear() == other.getYear())
			 return true; 
		return false; 
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
