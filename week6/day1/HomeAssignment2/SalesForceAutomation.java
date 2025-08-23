package week6.day1.HomeAssignment2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceAutomation extends DynamicBaseClass {
	
	@DataProvider
    public String[][] sendDynamicData()
    {
		String data[][] = new String[3][1];
		data[0][0]="SalesForce Automaton by Likhith";
		data[1][0]="SalesForce Automaton by John";
		data[2][0]="SalesForce Automaton by Alan";
		return data;
    }
	
	@Test(dataProvider="sendDynamicData")
	public void salesforceautomation(String name) throws InterruptedException {
		// open app launcher
		driver.findElement(By.xpath("//button[.//span[text()='App Launcher']]")).click();
		Thread.sleep(8000);

		// click on view all button
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// search for legal Entities
		driver.findElement(By.xpath("(//input[contains(@class,'slds-input')])[2]")).sendKeys("legal Entities");
		Thread.sleep(2000);

		// click on legal Entities from search result
		driver.findElement(By.xpath("//p[@class ='slds-truncate']")).click();

		// click on new button
		driver.findElement(By.xpath("//div[text()='New']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Fill the legal entry name field
		WebElement legalNameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
		legalNameField.clear();
		legalNameField.sendKeys(name);

		// save the entries
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);

	}

}
