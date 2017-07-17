package com.krutova.itcompany.action;

import com.krutova.itcompany.staff.Employee;

public class StaffCalculation {
	
	public static double costPerHour (Employee employee){
		return employee.getSalary()/employee.getContractType().getCountDays();
	}
	
	

}
