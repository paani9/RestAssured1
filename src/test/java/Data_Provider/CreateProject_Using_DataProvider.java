package Data_Provider;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;


public class CreateProject_Using_DataProvider {
	
	@Test(dataProvider="getData")
public void createProject_DP(String createdBy,String projectName,String status,int teamSize)
{
		Random ran=new Random();
		int rand=ran.nextInt();
		
		ProjectLibrary p=new ProjectLibrary(createdBy,projectName+rand,status,teamSize);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(p).contentType(ContentType.JSON).when().post("/addProject").then().log().all();
}
	
	@DataProvider(name="getData")
	public Object[][] data()
	{
		
		Object[][] data=new Object[2][4];
		data[0][0]="s40";
		data[0][1]="s41";
		data[0][2]="completed";
		data[0][3]=21;
		
		data[1][0]="ss42";
		data[1][1]="ss42";
		data[1][2]="completed";
		data[1][3]=29;
		return data;
	
	}
		}



