package com.krutova.itcompany.action;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.krutova.itcompany.staff.Developer;

public class StaffFinder {
	
	public static ArrayList<Developer> listSubord(ArrayList<Developer> devList, int managerId){
		Predicate<Developer> predicate = (d) -> d.getManagerId() ==managerId;
		ArrayList<Developer> listSub = (ArrayList<Developer>) devList.stream().filter(predicate).collect(Collectors.toList());
		return listSub;
	}
	
}
