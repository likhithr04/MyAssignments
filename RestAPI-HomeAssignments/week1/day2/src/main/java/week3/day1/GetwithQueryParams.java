package week3.day1;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GetwithQueryParams {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://dev323752.service-now.com";
        RestAssured.authentication = RestAssured.basic("admin", "mnYC2g!e1OU^");

        // Query Parameters
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("sysparm_fields", "sys_id,short_description");
        queryParams.put("sysparm_limit", "3");

        RequestSpecification input = RestAssured.given().queryParams(queryParams);

        // GET request
        Response response = input.get("/api/now/table/incident");

        // Print and verify status code
        int statusCode = response.getStatusCode();
        System.out.println("GET Status Code: " + statusCode);

        // ✅ Validate status code using Rest Assured
        response.then().statusCode(200);

        // Print response body
        response.prettyPrint();
    }

	

}
