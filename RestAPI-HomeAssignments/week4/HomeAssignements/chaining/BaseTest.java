package week4.day1.HomeAssignements.chaining;
import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;

public class BaseTest {

	public static String sys_Id ;  
	@BeforeTest
    public void setUp(){

		RestAssured.baseURI="https://dev323752.service-now.com/api/now/table/incident";
			
		RestAssured.authentication= RestAssured.basic("admin", "mnYC2g!e1OU^");
     }

}
