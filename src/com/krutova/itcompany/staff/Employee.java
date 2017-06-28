package com.krutova.itcompany.staff;

import java.util.Date;

public class Employee {

	private String firstName;
	private String lastName;
	private Date hiredate;
	private double salary;
	
	public Employee(String firstName,String lastName,Date hiredate,double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hiredate = hiredate;
		this.salary = salary;
	}
	
	public Employee() {
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public double getSalary() {
		return salary;
	}
}
