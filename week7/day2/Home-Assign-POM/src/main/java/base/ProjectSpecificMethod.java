package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethod {

	public  ChromeDriver driver;
	public  ChromeOptions options;

	@BeforeMethod
	public void preConditions() {
		options = new ChromeOptions();
		options.addArguments("Guest");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		driver.quit();

	}

}
