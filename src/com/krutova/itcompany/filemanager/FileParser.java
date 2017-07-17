package com.krutova.itcompany.filemanager;

import java.util.ArrayList;

import com.krutova.itcompany.exception.CompanyException;
import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.team.Team;
import com.krutova.itcompany.type.ContractType;
import com.krutova.itcompany.type.DevTitle;

public class FileParser {
private static final String DATA_DEVELOPER = "resources\\inputDataDeveloper.txt";
//private static final String DATA_MANAGER = "resources\\inputDataManager.txt";
	
	public static void parseFileToTeam(Team team) {
		
		
		ArrayList<String> lines = null;
		try {
			lines = FileManager.readLineFromFile(DATA_DEVELOPER);
		} catch (CompanyException e) {
			e.printStackTrace();
		}		
		for (String rowLines : lines){
			String[] str = rowLines.split(",");
			team.addNewEmployee(new Developer(str[0], str[1], Integer.parseInt(str[2]), ContractType.valueOf(str[3]), DevTitle.valueOf(str[4]), Integer.parseInt(str[5])));
			} 
	
		}
		
}
