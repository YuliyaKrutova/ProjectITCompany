package test.krutova.itcompany.team;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.itcompany.filemanager.FileParser;
import com.krutova.itcompany.team.Team;

public class CostTeamTest {

	@Test
	public void test() {
		Team team = new Team();
		FileParser.parseFileToTeam(team,"resources\\inputDataDeveloper.txt");
		Assert.assertEquals(3.125, team.getAmount(),0.1);
	}

}
