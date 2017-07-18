package com.krutova.itcompany.main;

import java.util.ArrayList;

import com.krutova.itcompany.action.TeamAction;
import com.krutova.itcompany.filemanager.FileParser;
import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.staff.Employee;
import com.krutova.itcompany.staff.Manager;
import com.krutova.itcompany.type.ContractType;
import com.krutova.itcompany.type.ManagerType;
import com.krutova.itcompany.team.Team;

public class TeamMain {

	public static final int MIN_SALARY = 50;
	public static final int MAX_SALARY = 150;
	
	public static void main(String[] args)  {
		
		Team team = new Team(); 
		
		Manager manager = new Manager("Менеджер", "Хороший", 1000, ContractType.FULLTIME,ManagerType.PM);

		team.addNewEmployee(manager);

		FileParser.parseFileToTeam(team);

		ArrayList<Employee> teamList  = team.getTeam();
		
		ArrayList<Developer> devList = new ArrayList<Developer>();
		for (Employee emp: teamList){
			if (emp instanceof Developer){
				devList.add((Developer) emp);
			}
		}
		
		ArrayList<Developer> subordList  =manager.listOfSubordinates(devList);
		
		System.out.println("-------------------");
		System.out.println("Список субординатов менеджера '"+manager.getLastName()+" "+manager.getFirstName()+"'");
		subordList.stream().forEach((e)->System.out.println(e.formatString()));
		System.out.println("-------------------");
		
		team.teamInfo();
		
		TeamAction.sortedTeamSalary(teamList);

		TeamAction.sortedTeamFullName(teamList);
		
		TeamAction.filteredTeam(teamList, MIN_SALARY, MAX_SALARY);
	}

}
