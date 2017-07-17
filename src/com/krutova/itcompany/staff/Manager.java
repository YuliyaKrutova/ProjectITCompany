package com.krutova.itcompany.staff;

import java.util.ArrayList;

import com.krutova.itcompany.action.StaffFinder;
import com.krutova.itcompany.type.ContractType;
import com.krutova.itcompany.type.ManagerType;

public class Manager extends Employee {

	private ManagerType managerType;
	
	public Manager(String firstName,String lastName,double salary, ContractType contractType, ManagerType managerType) {
		super(firstName,lastName,salary,contractType);
		this.managerType = managerType;
	}
	
	public ArrayList<Developer> listOfSubordinates(ArrayList<Developer> devList) {
		return StaffFinder.listSubord(devList,this.getId());
	}

	public ManagerType getManagerType() {
		return managerType;
	}



}
