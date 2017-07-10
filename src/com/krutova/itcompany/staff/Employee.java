package com.krutova.itcompany.staff;

import java.util.Calendar;

public class Employee {

	private int id;
	private String firstName; //Русский коммент
	private String lastName;
	private Calendar hiredate;
	private double salary;
	
	public Employee(int id, String firstName,String lastName,Calendar d,double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hiredate = d;
		this.salary = salary;
	}
	
	public Employee() {
	}

	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Calendar getHiredate() {
		return hiredate;
	}

	public double getSalary() {
		return salary;
	}
}
