package CRUD_without_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProjectTest {
	
	@Test
	public void getSingleProj()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_348");
		resp.then().log().all();
		int actSta=resp.getStatusCode();
		Assert.assertEquals(200,actSta);
	}

}
