package com.krutova.itcompany.sort;

import java.util.Comparator;

import com.krutova.itcompany.staff.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		double salary1 = employee1.getSalary();
        double salary2 = employee2.getSalary();

        if(salary1 > salary2) {
               return 1;
        }
        else if(salary1 < salary2) {
               return -1;
        }
        else {
               return 0;
        }
	}

}
