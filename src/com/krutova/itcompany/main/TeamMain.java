package com.krutova.itcompany.main;

import java.util.ArrayList;

import com.krutova.itcompany.action.TeamAction;
import com.krutova.itcompany.filemanager.FileToTeamLoader;
import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.staff.Employee;
import com.krutova.itcompany.team.Team;

public class TeamMain {

	public static final int MIN_SALARY = 50;
	public static final int MAX_SALARY = 150;
	private static final String DATA_DEVELOPER = "resources\\inputDataDeveloper.txt";
	private static final String DATA_MANAGER = "resources\\inputDataManager.txt";
	
	public static void main(String[] args)  {
		
		Team team = new Team(); 

		FileToTeamLoader.loadFileToTeam(team, DATA_DEVELOPER);
		FileToTeamLoader.loadFileToTeam(team, DATA_MANAGER);

		ArrayList<Employee> teamList  = team.getTeam();
		
		
		ArrayList<Developer> devList = new ArrayList<Developer>();
		for (Employee emp: teamList){
			if (emp instanceof Developer){
				devList.add((Developer) emp);
			}
		}
		
		
		team.teamInfo();
		
		TeamAction.sortedTeamSalary(teamList);

		TeamAction.sortedTeamFullName(teamList);
		
		TeamAction.filteredTeam(teamList, MIN_SALARY, MAX_SALARY);
	}

}
