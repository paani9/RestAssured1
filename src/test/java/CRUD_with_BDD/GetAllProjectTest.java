package CRUD_with_BDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GetAllProjectTest {
	@Test
	public void getAllProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects").then().log().all();
	}
	
	

}
