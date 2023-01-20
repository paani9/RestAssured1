package authenticationTypes;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Bearer_Token {
	@Test
	public void bearerToken()
	{
		
		baseURI="https://api.github.com";
		JSONObject jobj=new JSONObject();
		jobj.put("name","sdet40ra11");
		given().auth().oauth2("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").body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
