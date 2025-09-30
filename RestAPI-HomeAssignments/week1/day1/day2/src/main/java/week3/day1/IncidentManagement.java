package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class IncidentManagement {

	

	 String sys_id;

	    @Test(priority = 1)
	    public void createIncident() {
	        RestAssured.baseURI = "https://dev323752.service-now.com";
	        RestAssured.authentication = RestAssured.basic("admin", "mnYC2g!e1OU^");

	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body("{ \"short_description\": \"Test incident for PUT/DELETE\" }")
	                .post("/api/now/table/incident");

	        sys_id = response.jsonPath().getString("result.sys_id");
	        System.out.println("Created sys_id: " + sys_id);

	        response.then().statusCode(201); // Created
	    }

	    @Test(priority = 2)
	    public void updateIncident() {
	        String updatePayload = "{ \"short_description\": \"Updated via RestAssured\" }";

	        Response response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(updatePayload)
	                .put("/api/now/table/incident/" + sys_id);

	        System.out.println("PUT Status Code: " + response.getStatusCode());
	        response.then().statusCode(200);
	    }

	    @Test(priority = 3)
	    public void deleteIncident() {
	        Response response = RestAssured.delete("/api/now/table/incident/" + sys_id);

	        System.out.println("DELETE Status Code: " + response.getStatusCode());
	        response.then().statusCode(204); // No Content
}
    }
