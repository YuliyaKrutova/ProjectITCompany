package test.krutova.itcompany.staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.krutova.itcompany.sort.EmployeeSortName;
import com.krutova.itcompany.sort.EmployeeSortSalary;
import com.krutova.itcompany.staff.Employee;
import com.krutova.itcompany.staff.Developer;
import com.krutova.itcompany.team.TeamOfDevelopers;

public class TeamOfDevelopersTest {

	//sort for test, (to delete)
	@Test
	public void test() {
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee("Masha1", "LastNameMasha1", null, 12000D);
		employee[1] = new Employee("Masha3", "LastNameMasha3", null, 11000D);
		employee[2] = new Employee("Masha2", "LastNameMasha2", null, 10000D);
		
        System.out.println("============ no sorted ==============");
       
        for(Employee emp : employee) {
               System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }
        System.out.println("========== sorted by Salary===========");

        Arrays.sort(employee, new EmployeeSortSalary());
       
        for(Employee emp : employee) {
               System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }     

        System.out.println("========== sorted by Last Name ===========");
       
        Arrays.sort(employee, new EmployeeSortName());
        for(Employee emp : employee) {
            System.out.println("LastName: " + emp.getLastName() + " salary: " + emp.getSalary());
        }

	
	}

}
