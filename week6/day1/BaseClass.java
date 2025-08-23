package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeOptions options;
	public ChromeDriver driver;
	@Parameters({"url","username","password","submit","crmfsa","Leads"})
	@BeforeMethod
	public void baseLead(String url,String username,String password,String submit,String crmfsa, String Leads)
	{
		System.out.println("inside pre condition");
		options=new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className(submit)).click();
		driver.findElement(By.linkText(crmfsa)).click();
		driver.findElement(By.linkText(Leads)).click();
	}
	
	@AfterMethod
	public void quit()
	{
		System.out.println("inside post condition");
		driver.quit();
	}

}
