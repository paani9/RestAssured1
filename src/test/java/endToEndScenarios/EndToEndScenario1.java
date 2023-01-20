package endToEndScenarios;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.sql.SQLException;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;
import genericUtility.BaseClassApi;
import genericUtility.EndPointsLibrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EndToEndScenario1 extends BaseClassApi {
	@Test
	public void createProject() throws SQLException
	{
		ProjectLibrary pLib=new ProjectLibrary("project101","Project101"+jLib.randomNum(),"completed",16);
		baseURI="http://rmgtestingserver";
		port=8084;
	Response resp=given().body(pLib).contentType(ContentType.JSON).when().post(EndPointsLibrary.createProject);
String expData=resp.jsonPath().get("projectId");

	System.out.println(expData);

	//   resp.then().log().all();
	String actData = dLib.readDataFromDbAndValidate("select * from project",1,expData);
		
		if(actData==expData)
		{
			System.out.println("Tc Pass");
		}
		else
		{
			System.out.println("Tc Fail");
		}
		
	}

}
