package authenticationTypes;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Basic_Digest {
	
	@Test
	public void basicDigestAuth()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given().auth().digest("rmgyantra","rmgy@9999")
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();
		
		
		
	}
			

}
