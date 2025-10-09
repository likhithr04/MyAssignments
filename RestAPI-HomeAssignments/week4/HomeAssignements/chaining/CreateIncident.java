package week4.day1.HomeAssignements.chaining;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class CreateIncident extends BaseTest {

    @Test(priority = 1)
    public void createIncident() {
        // Request body
    	String requestBody = "{"
                + "\"short_description\": \"Created via chaining\","
                + "\"description\": \"This incident was created using API chaining automation\","
                + "\"category\": \"inquiry\""
                + "}";


        // Send POST request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .log().all()
            .when()
                .post()
            .then()
                .log().all()
                .extract().response();

        // Validate creation
        Assert.assertEquals(response.getStatusCode(), 201, "Incident not created successfully");

        // Extract and store sys_id
        sys_Id = response.jsonPath().getString("result.sys_id");
        System.out.println("✅ Incident Created | Sys_ID: " + sys_Id);
    }
}
