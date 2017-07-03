package com.krutova.itcompany.staff;

import java.util.Date;

public class Developer extends Employee{

	
	private String contractType; //full-time or part-time. maybe I should use enum.....(ask Igor)
	private String position; //JavaDeveloper, DBDeveloper, ....
	
	public Developer(int id, String firstName,String lastName,Date hiredate,double salary,String contractType, String position) {
		super(id, firstName,lastName,hiredate,salary);
		this.contractType = contractType;
		this.position = position;
	}
	
	public double costPerHour (){
		double cost;
		if ("full-time".equals(contractType)){
			cost = super.getSalary()/160; //20days * 8hours
		}
		else {
			cost = super.getSalary()/80;
		}
		return cost;
	}
	

}
