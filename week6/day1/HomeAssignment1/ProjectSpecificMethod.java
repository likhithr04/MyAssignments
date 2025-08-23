package week6.day1.HomeAssignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public ChromeDriver driver;

	@Parameters({ "url", "username", "password", "login_Click" })
	@BeforeMethod
	public void preCondition(String url, String username, String password, String login_Click)
			throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// load url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// enter creds
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id(login_Click)).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void postCondition() {

		driver.quit();
	}
}
