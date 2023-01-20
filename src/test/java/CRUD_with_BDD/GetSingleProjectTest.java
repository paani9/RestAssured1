package CRUD_with_BDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetSingleProjectTest {
	@Test
	public void getSingleProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects/TY_PROJ_306").then().log().all();
		
	}

}
