package Parameter_with_BDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleProjectTest {
	@Test
	public void getSingleProject() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given().pathParam("projectid","TY_PROJ_420")
		.when().get("/projects/{projectid}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
		
		
		
		
		
		
		
		
		
	}
	

}
