package Static_Dynamic_Response_Validation;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidationGet {
	
	@Test
	public void staticResponseValidation()
	{
		
		String expData="TY_PROJ_011";
		baseURI="http://rmgtestingserver";
		port=8084;
		Response resp=when().get("/projects");;;;;
				
		String actData=resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actData,expData);
		System.out.println("data verified");
           resp.then().log().all();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
