package CRUD_with_BDD;

import java.util.Random;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectTest {

	@Test
	public void createProject()
	{
		
		
		
		Random ran = new Random();
		int rand=ran.nextInt();
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","sd40");
		jobj.put("projectName","sd40"+rand);
		jobj.put("status","on going");
		jobj.put("teamSize",100);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
