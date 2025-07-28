package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver =new ChromeDriver(options);
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Likhith");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select industry =new Select(element);
		industry.selectByIndex(3);
		
		WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
		Select ownnership =new Select(element1);
		ownnership.selectByVisibleText("S-Corporation");
		
		WebElement element2 = driver.findElement(By.id("dataSourceId"));
		Select source =new Select(element2);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
		Select MarketingCampaign =new Select(element3);
		MarketingCampaign.selectByIndex(6);
		
		WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select State =new Select(element4);
		State.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
	}

}
