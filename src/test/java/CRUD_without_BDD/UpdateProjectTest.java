package CRUD_without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	@Test
	public void updateProj()
	{
		
		
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","S24");
		jobj.put("projectName","cjobs22");
		jobj.put("status","On going");
		jobj.put("teamSize",29);
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
Response response = req.post("http://rmgtestingserver:8084/projects/TY_PROJ_348");
		System.out.println(response.getContentType());
		System.out.println(response.asString());
		
		
		
		
		
		
		
		
	}

}
