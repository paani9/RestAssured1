package CRUD_without_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {

	@Test
	public void deleteProject()
	{
		Response resp = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_354");
		resp.then().log().all();
		int actstat=resp.getStatusCode();
		Assert.assertEquals(actstat,204);
	}
	
	
	
	
	
}
