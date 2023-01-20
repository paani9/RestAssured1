package CRUD_without_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {
	
	@Test
	public void getAllProjects()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects");
		resp.then().log().all();
		int actSta=resp.getStatusCode();
		Assert.assertEquals(200,actSta);
		
	}

}
