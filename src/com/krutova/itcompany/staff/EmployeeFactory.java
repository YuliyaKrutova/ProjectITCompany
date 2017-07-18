package com.krutova.itcompany.staff;

import com.krutova.itcompany.exception.CompanyException;
import com.krutova.itcompany.type.ContractType;
import com.krutova.itcompany.type.DataSourceType;
import com.krutova.itcompany.type.DevTitle;
import com.krutova.itcompany.type.ManagerType;

public class EmployeeFactory {
	
	
	public Employee newEmployee(String[] str) throws CompanyException {
		
		if (DataSourceType.DEVELOPER.name().equals(str[0])){
		return new Developer(str[1], str[2], Integer.parseInt(str[3]), ContractType.valueOf(str[4]), DevTitle.valueOf(str[5]), Integer.parseInt(str[6]));
		} else if (DataSourceType.MANAGER.name().equals(str[0])){
			return new  Manager(str[1], str[2], Integer.parseInt(str[3]), ContractType.valueOf(str[4]),ManagerType.valueOf(str[5]));
		}
			throw new CompanyException();
	}

}
