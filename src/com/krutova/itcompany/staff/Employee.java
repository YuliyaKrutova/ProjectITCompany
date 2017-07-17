package com.krutova.itcompany.staff;

import com.krutova.itcompany.action.IdGenerator;
import com.krutova.itcompany.type.ContractType;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private ContractType contractType;
	
	public Employee(String firstName,String lastName,double salary,ContractType contractType) {
		this.id = IdGenerator.idInc();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.contractType = contractType;
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

	public double getSalary() {
		return salary;
	}
	
	public ContractType getContractType() {
		return contractType;
	}

	public String formatString(){
		return String.format("%6d %-12s %-12s %10.2f",id,lastName,firstName,salary);
	}
	
}
