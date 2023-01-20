package authenticationTypes;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



import io.restassured.response.Response;

public class Oauth {
	@Test
	public void oauthAuthentication()
	{

		Response resp=given().formParam("client_id","sdet40a")
		.formParam("client_secret","f2df958568c3890033935c1fe58551bd")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri","https://sdet40a.com")
		.formParam("code","authorization_code")
		.when().post("http://coop.apps.symfonycasts.com/token");
		String token=resp.jsonPath().get("access_token");
		System.out.println(token);
		given().auth().oauth2(token).pathParam("USER_ID",4105)
		.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		.then().log().all();
		
	}

}
