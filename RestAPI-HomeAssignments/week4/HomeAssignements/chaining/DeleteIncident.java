package week4.day1.HomeAssignements.chaining;


import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteIncident extends BaseTest {

    @Test(priority = 3)
    public void deleteIncident() {

        Response response = given()
                .header("Content-Type", "application/json")
                .log().all()
            .when()
                .delete("/"+sys_Id )
            .then()
                .log().all()
                .extract().response();

        System.out.println("Base URI: " + baseURI);
        System.out.println("Sys_ID: " + sys_Id);
        System.out.println("Full Delete URL: " + baseURI + "/" + sys_Id);

        // Validate delete
        Assert.assertEquals(response.getStatusCode(), 204, "Incident delete failed");
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 204 No Content", "Invalid status line");

        long responseTime = response.getTime();
        Assert.assertTrue(responseTime < 3000, "Response time should be < 3 seconds");

        System.out.println("✅ Incident Deleted | Sys_ID: " +sys_Id );
    }
}

