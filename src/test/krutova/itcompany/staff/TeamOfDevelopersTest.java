package test.krutova.itcompany.staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.krutova.itcompany.sort.EmployeeNameComparator;
import com.krutova.itcompany.sort.EmployeeSalaryComparator;
import com.krutova.itcompany.staff.Employee;
import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.team.TeamOfDevelopers;

public class TeamOfDevelopersTest {

	//sort for test, (to delete)
	@Test
	public void test() {
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee(1,"Masha1", "LastNameMasha1", null, 12000D);
		employee[1] = new Employee(2,"Masha3", "LastNameMasha3", null, 11000D);
		employee[2] = new Employee(3,"Masha2", "LastNameMasha2", null, 10000D);
		
        System.out.println("no sorted");
       
        for(Employee emp : employee) {
               System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }
        System.out.println("sorted by Salary");

        Arrays.sort(employee, new EmployeeSalaryComparator());
       
        for(Employee emp : employee) {
               System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }     

        System.out.println("sorted by Last Name");
       
        Arrays.sort(employee, new EmployeeNameComparator());
        for(Employee emp : employee) {
            System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }

	
	}

}
