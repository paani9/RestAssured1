package CRUD_with_BDD;

import java.util.Random;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectTest {
	@Test
	public void updateProjectTest()
	{
		Random ran = new Random();
		int rand=ran.nextInt();
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","s44");
		jobj.put("projectName","s44"+rand);
		jobj.put("status","on going");
		jobj.put("teamSize",40);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(jobj).contentType(ContentType.JSON).when().put("/projects/TY_PROJ_306").then().assertThat().statusCode(200);
		
		
	}

}
