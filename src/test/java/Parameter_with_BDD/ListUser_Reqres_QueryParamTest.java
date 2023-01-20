package Parameter_with_BDD;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ListUser_Reqres_QueryParamTest {
	
	@Test
	public void getListUser()
	{
		baseURI="https://reqres.in";
		given().queryParam("page",2)
		.when().get("/api/users")
		.then().assertThat().contentType(ContentType.JSON).statusCode(200).log().all();
	}
	

}
