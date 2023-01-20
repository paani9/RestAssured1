package RequestChainning;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Create_Project_RC {
	
	
	@Test
	public void Get_Create_Project()
	{
		Random rand=new Random();
		int ran=rand.nextInt();
		ProjectLibrary p=new ProjectLibrary("s42","s"+ran,"completed",60);
		baseURI="http://rmgtestingserver";
		port=8084;
		Response resp=given().body(p).contentType(ContentType.JSON).when().post("/addProject");
		String pid=resp.jsonPath().get("projectId");
		System.out.println(pid);
		resp.then().log().all();
		given().pathParam("pID",pid)
		.when().get("/projects/{pID}")
		.then().assertThat().statusCode(200).log().all();
		
		
		
		
		
		

}

}
