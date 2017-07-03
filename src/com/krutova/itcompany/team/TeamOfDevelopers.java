package com.krutova.itcompany.team;

import java.util.ArrayList;
import java.util.List;

import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.staff.Employee;

public class TeamOfDevelopers {

	public static ArrayList<Employee> listOfDevelopers; 
	//1) add reading from file
	//2) 
	
	public TeamOfDevelopers() {
		listOfDevelopers.add(new Developer(1,"FirstName1", "LastName1", null, 13000, "full-time", "Java Developer"));
		listOfDevelopers.add(new Developer(2,"FirstName2", "LastName2", null, 12000, "full-time", "DB Developer"));
		listOfDevelopers.add(new Developer(3,"FirstName3", "LastName3", null, 11000, "part-time", "Java Developer"));
		listOfDevelopers.add(new Developer(4,"FirstName4", "LastName4", null, 10000, "full-time", "C# Developer"));
	}

	/*public ArrayList<Developer> getListOfDevelopers() {
		return listOfDevelopers;
	}*/
	

}
