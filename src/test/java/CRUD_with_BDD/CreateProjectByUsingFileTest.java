package CRUD_with_BDD;

import java.io.File;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectByUsingFileTest {
	
	@Test
	public void createProjectUsingFile()
	{
		File file=new File("C:\\Users\\jayasree\\OneDrive\\Desktop\\datadriventesting.json");
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
				
	}
	
	
	
	
	
	
	
	
	
	

}
