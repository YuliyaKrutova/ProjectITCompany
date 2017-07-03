package com.krutova.itcompany.sort;

import java.util.Comparator;

import com.krutova.itcompany.staff.Employee;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		String lastName1 = employee1.getLastName();
		String lastName2 = employee2.getLastName();
		return lastName1.compareTo(lastName2);
	}

}
