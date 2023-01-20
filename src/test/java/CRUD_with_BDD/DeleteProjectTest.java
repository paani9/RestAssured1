package CRUD_with_BDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class DeleteProjectTest {
	@Test
	public void deleteProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().delete("/projects/TY_PROJ_306").then().assertThat().statusCode(204).log().all();
	}

}
