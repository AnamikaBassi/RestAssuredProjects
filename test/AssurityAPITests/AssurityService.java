package AssurityAPITests;

import static io.restassured.RestAssured.given;

import AssurityAPI.ConfigureAPI;
import io.restassured.response.Response;

public class AssurityService {

	protected final static String BASE_URL = ConfigureAPI.loadAPICredentials().getProperty("assurityURL");
	protected final static String NAME = ConfigureAPI.loadAPICredentials().getProperty("name");
	protected final static String GALL_STRING = "2x larger image";


	public Response getAPIResponse(){
		return 
			given().
			when().
				get(BASE_URL).
			then().log().all().
				extract().response();

	}
}
