package week3.day1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ChangeRequestManagement {

	public static void main(String[] args) {
        // Base URI and authentication setup
        RestAssured.baseURI = "https://dev323752.service-now.com";
        RestAssured.authentication = RestAssured.basic("admin", "mnYC2g!e1OU^");
        
        // Create a new change request
        createChangeRequest();
    }

    public static void createChangeRequest() {
        // Change request payload
        String changeRequestPayload = "{\n" +
                "  \"short_description\": \"Test Change Request 2\",\n" +
                "  \"description\": \"Created via RestAssured\"\n" +
                "}";

        // Sending POST request to create change request
        Response response = given()
                .contentType(ContentType.JSON)
                .body(changeRequestPayload)
                .post("/api/now/table/change_request");

        // Print response to console
        System.out.println("Create Change Request Response: ");
        response.prettyPrint();
    }

}
