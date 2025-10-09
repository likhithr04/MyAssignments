package week4.day1.HomeAssignements;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class DeleteRequest {

    public static void main(String[] args) {

       
        String sys_id = "cecef06883e8f61064e67965eeaad3a4";

        
        Response response = RestAssured
                .given()
                .baseUri("https://dev323752.service-now.com")
                .basePath("/api/now/table")
                .auth().basic("admin", "mnYC2g!e1OU^")
                .header("Content-Type", "application/json")
                .pathParam("tableName", "incident")
                .pathParam("sysId", sys_id)
                .log().all()
                .when()
                .delete("/{tableName}/{sysId}");

        // Step 6: Extract and print response details
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Status Line: " + response.getStatusLine());
        System.out.println("Response Time: " + response.getTime() + " ms");

        // Step 7: Validate Status Code = 204
        Assert.assertEquals(response.getStatusCode(), 204,
                "Status code should be 204 - No Content");

        // Step 8: Validate Status Line
        Assert.assertEquals(response.getStatusLine(),
                "HTTP/1.1 204 No Content",
                "Status line should be 'HTTP/1.1 204 No Content'");

        // Step 9: Validate Response Time < 500 ms
        long responseTime = response.getTime();
        Assert.assertTrue(responseTime < 3500,
                "Response time should be less than 500ms");

        System.out.println("✅ Delete operation validated successfully!");
    }
}
