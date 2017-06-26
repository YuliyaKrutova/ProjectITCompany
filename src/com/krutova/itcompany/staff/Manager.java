package com.krutova.itcompany.staff;

import java.util.Date;

public class Manager extends Employee {

	private int NumOfSubord;
	private double bonus;
	
	public Manager(String firstName,String lastName,Date hiredate,double salary, int NumOfSubord, double bonus) {
		super(firstName,lastName,hiredate,salary);
		this.NumOfSubord = NumOfSubord;
		this.bonus = bonus;
	}
	
	public double getSalary(){
		return super.getSalary()+bonus;
	}

}
