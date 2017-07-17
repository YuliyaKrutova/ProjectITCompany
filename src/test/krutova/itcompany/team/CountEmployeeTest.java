package test.krutova.itcompany.team;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.itcompany.filemanager.FileParser;
import com.krutova.itcompany.team.Team;

public class CountEmployeeTest {

	@Test
	public void test() {
		Team team = new Team();
		FileParser.parseFileToTeam(team);
		
		Assert.assertEquals(5, team.getCountEmployee());
	}

}
