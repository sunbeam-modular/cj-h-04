package com.util;

import java.util.Comparator;

import com.domain.Employee;

public class CompareByEmpid implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		int diff = Integer.compare(x.getEmpid(),y.getEmpid()); 
		return diff;
	}

}
