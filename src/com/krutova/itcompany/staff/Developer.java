package com.krutova.itcompany.staff;

import com.krutova.itcompany.type.ContractType;
import com.krutova.itcompany.type.DevTitle;

public class Developer extends Employee{

	private DevTitle devTitle;
	private int managerId;
	
	public Developer(String firstName,String lastName,double salary,ContractType contractType, DevTitle devTitle, int managerId) {
		super(firstName,lastName,salary,contractType);
		this.devTitle = devTitle;
		this.managerId = managerId;
	}

	public DevTitle getDevTitle() {
		return devTitle;
	}

	public int getManagerId() {
		return managerId;
	}
	
	
}
