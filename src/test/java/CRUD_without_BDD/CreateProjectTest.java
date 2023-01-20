package CRUD_without_BDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest
{
@Test
public void createProj()
{
	
	
	
	
	Random ran = new Random();
	int rand=ran.nextInt();
	
	System.out.println(rand);
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","S24");
	jobj.put("projectName","cjobs24");
	jobj.put("status","On going");
	jobj.put("teamSize",20);
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response response = req.post("http://rmgtestingserver:8084/addProject");
	System.out.println(response.getContentType());
	System.out.println(response.asString());
	//System.out.println(response.prettyPrint());
	//System.out.println(response.prettyPeek());

	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
