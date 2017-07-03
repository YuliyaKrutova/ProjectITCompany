package com.krutova.itcompany.staff;

import java.util.ArrayList;
import java.util.Date;

public class Manager extends Employee {

	private int numOfSubord;
	private double bonus;
	private ArrayList<Employee> listSubId;
	
	public Manager(int id, String firstName,String lastName,Date hiredate,double salary, int numOfSubord, double bonus, ArrayList<Employee> listSubId) {
		super(id, firstName,lastName,hiredate,salary);
		this.numOfSubord = numOfSubord;
		this.bonus = bonus;
		this.listSubId = listSubId;
	}
	
	public double getSalary(){
		return super.getSalary()+bonus;
	}

}
