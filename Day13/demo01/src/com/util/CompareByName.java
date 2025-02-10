package com.util;

import java.util.Comparator;

import com.domain.Employee;

public class CompareByName implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		int diff = x.getName().compareTo(y.getName());  
		return diff;
	}

}
