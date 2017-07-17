package com.krutova.itcompany.action;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.itcompany.staff.Employee;

public class TeamAction {
	
	private static final Logger LOGGER  = LogManager.getLogger();
	static Comparator<Employee> compSalary = (e1, e2)-> (int)(e1.getSalary()-e2.getSalary());
	static Consumer<Employee> consumer = (e)->LOGGER.info(e.formatString());
	static Comparator<Employee> compFirstName= (e1, e2)->e1.getFirstName().compareTo(e2.getFirstName());
	static Comparator<Employee> compLastName = (e1, e2)->e1.getLastName().compareTo(e2.getLastName());
	

	public static void filteredTeam(ArrayList<Employee> teamList, int minSalary, int maxSalary) {
		Predicate<Employee> predicate = (e) -> e.getSalary() >= minSalary && e.getSalary() <=maxSalary;
		LOGGER.info("--------------------------------------------");
		LOGGER.info("������ � ����������(����.) �� ������ (>"+minSalary+" � <"+maxSalary+")");
		
		teamList.stream()
		.filter(predicate)
		.sorted(compSalary.reversed())
		.forEach(consumer) ;
	}
	
	public static void sortedTeamSalary(ArrayList<Employee> teamList) {
		LOGGER.info("--------------------------------------------------");
		LOGGER.info("���������� �� Salary");
		
		teamList.stream().sorted(compSalary ).forEach(consumer);
	}
	
	public static void sortedTeamFullName(ArrayList<Employee> teamList) {
		LOGGER.info("--------------------------------------------------");
		LOGGER.info("���������� �� ������� � �����");
		
		teamList.stream().sorted(compLastName.thenComparing(compFirstName)).forEach(consumer);
	}
}
