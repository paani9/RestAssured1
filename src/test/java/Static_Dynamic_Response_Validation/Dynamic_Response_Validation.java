package Static_Dynamic_Response_Validation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Dynamic_Response_Validation {
	
	@Test
	public void dynamicValidation()
	{
		String expData="TY_PROJ_018";
		baseURI="http://rmgtestingserver";
		port=8084;
		Response resp=when().get("/projects");
		boolean flag=false;
		List<String> pids = resp.jsonPath().get("projectId");
		for(String pid:pids)
		{
			if(pid.equalsIgnoreCase(expData))
			{
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("data verified");
		resp.then().log().all();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
