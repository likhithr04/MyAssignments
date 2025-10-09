package week4.day1.HomeAssignements.chaining;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class UpdateIncident extends BaseTest {

    @Test(priority = 2, dependsOnMethods = "week4.day1.HomeAssignements.chaining.CreateIncident.createIncident")
    public void updateIncident() {
        
        String updateBody = "{"
                + "\"short_description\": \"Updated via chaining\","
                + "\"description\": \"This incident was updated using API chaining automation\""
                + "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(updateBody)
                .log().all()
            .when()
                .put(sys_Id)
            .then()
                .log().all()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200, "Incident update failed");
        sys_Id = response.jsonPath().getString("result.sys_id");
        System.out.println("✅ Incident Updated | Sys_ID: " + sys_Id);
    }
}
