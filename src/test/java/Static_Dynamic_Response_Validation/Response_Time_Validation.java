package Static_Dynamic_Response_Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;



public class Response_Time_Validation {
	
	@Test
	public void responseTimeValidation()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects").then().assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
	
		
		
	}
	
	
	

}
