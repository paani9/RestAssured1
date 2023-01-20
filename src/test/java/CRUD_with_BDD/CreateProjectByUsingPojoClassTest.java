package CRUD_with_BDD;

import java.util.Random;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreateProjectByUsingPojoClassTest {
	@Test
	public void createProjectPojo()
	{
		Random ran=new Random();
		int rand=ran.nextInt();
		ProjectLibrary pl = new ProjectLibrary("s90","s"+rand,"completed",48);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(pl).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
