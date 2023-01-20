package CRUD_with_BDD;

import java.util.HashMap;
import java.util.Random;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectByUsingHashMapTest {
	@Test
	public void createProject()
	{
		
		Random ran = new Random();
		int rand=ran.nextInt();
		HashMap map=new HashMap();
		map.put("createdBy","s41");
		map.put("projectName","s41"+rand);
		map.put("status","completed");
		map.put("teamSize",50);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(map).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
		
		
		
		
		
	}

}
