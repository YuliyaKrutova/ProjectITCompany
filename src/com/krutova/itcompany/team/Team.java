package com.krutova.itcompany.team;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.itcompany.action.StaffCalculation;
import com.krutova.itcompany.staff.Employee;

public class Team { 

	private static final Logger LOGGER  = LogManager.getLogger();
	
	private ArrayList<Employee> team = new ArrayList<Employee>(); 
	private static double amount;
	private static int countEmployee;
	
	public void addNewEmployee(Employee employee){
		if (!team.contains(employee)){
			team.add(employee);

			amount+=StaffCalculation.costPerHour(employee);
			++countEmployee;
			LOGGER.info("Добавлен новый сотрудник с ID="+employee.getId());
		}		 
	}

	public double getAmount() { 
		teamInfo();
		return amount;
	}

	public int getCountEmployee() {
		return countEmployee;
	}

	public ArrayList<Employee> getTeam() {
		return team;
	}
	
	@Override
	public String toString() {
		return "TeamOfDevelopers [team=" + team + "]";
	}
	
	public void teamInfo() {
		LOGGER.info("Стоимость команды, состоящей из "+countEmployee+"чел. = "+amount+"\u20ac");
	}
	
	
	
	

}
