package com.util;

import java.util.Comparator;

import com.domain.Employee;

public class CompareBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		int diff = Float.compare(x.getSalary(), y.getSalary()); 
		return diff;
	}

}
