package com.krutova.itcompany.filemanager;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.itcompany.exception.CompanyException;
import com.krutova.itcompany.staff.EmployeeFactory;
import com.krutova.itcompany.team.Team;

public class FileParser {


	private static final Logger LOGGER  = LogManager.getLogger();
	public static void parseFileToTeam(Team team, String filePath) {
		

		ArrayList<String> lines = null;
		try {
			lines = FileManager.readLineFromFile(filePath);
		} catch (CompanyException e) {
			e.printStackTrace();
		}
		String[] str = null;
		for (String rowLines : lines){
			str = rowLines.split(";");
			try {
				team.addNewEmployee(new EmployeeFactory().newEmployee(str));
			} catch (CompanyException e) {
				LOGGER.error("Не существующий тип Employee в файле");
			}
		}
		

	
		}
		
}
