package week3.day1;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

public class CreateChangeRequestWithFile {

	@Test
public void createChangeRequestWithFile() {		
		
		File requestBody = new File("src/main/resources/request_payload/changeRequestBody.json");
				
		given()
		   .baseUri("https://dev323752.service-now.com")
		   .basePath("/api/now/table")
		   .auth().basic("admin", "mnYC2g!e1OU^")
		   .header("Content-Type", "application/json")
		   .pathParam("tableName", "incident")
		   .log().all()
		.when()
		   .body(requestBody)
		   .post("/{tableName}")
		.then()
		   .log().all()
		   .assertThat()
		   .statusCode(201)
		   .statusLine(containsString("Created"))
		   //.contentType(containsString("application/json")); 
		   .contentType(ContentType.JSON)
		   .time(lessThan(5000L));

	}
}
