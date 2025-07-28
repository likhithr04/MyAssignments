package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Likhith");

		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

		// Step1: Find the dropdown element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Select-Create an Object
		Select dropdown = new Select(sourceElement);

		// Step3: Use the method to Select - 3 Methods
		dropdown.selectByIndex(4);

		WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(MarketingCampaign);
		dropdown2.selectByIndex(3);

		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3 = new Select(Industry);
		dropdown3.selectByVisibleText("Computer Software");

		
		WebElement ownnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 = new Select(ownnership);
		dropdown4.selectByValue("OWN_CCORP");

		// Click on the Create lead button
		driver.findElement(By.name("submitButton")).click();
	}

}
