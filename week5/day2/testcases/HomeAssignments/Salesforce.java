package week5.day2.testcases.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {

	@Test
	public void salesforce() throws InterruptedException {
		// open app launcher
		driver.findElement(By.xpath("//button[.//span[text()='App Launcher']]")).click();
		Thread.sleep(2000);

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
		// 1. Interact with fields inside modal
		WebElement nameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='CompanyName']")));
		nameField.sendKeys("Test Leaf");

		// 2.fill the description field
		WebElement descriptionField = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//textarea[contains(@class,'slds-textarea')])[2]")));
		descriptionField.sendKeys("Salesforces");

		// 3. checking whether element is visible or not
		wait.until(ExpectedConditions.invisibilityOfElementLocated(
				By.xpath("//div[contains(@class,'modal-container') and contains(@class,'slds-fade-in-open')]")));

		// 4. Click the Status drop-down
		WebElement statusDropdown = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@role='combobox' and @aria-label='Status']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", statusDropdown);

		// 5. Wait until the dropdown expands (aria-expanded changes to true)
		wait.until(ExpectedConditions.attributeToBe(statusDropdown, "aria-expanded", "true"));

		// 6. wait until element is visible
		WebElement activeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//lightning-base-combobox-item//span[normalize-space()='Active']")));

		// using js to select dropdown for active button
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 7. Scroll into view and click with JS
		js.executeScript("arguments[0].scrollIntoView(true);", activeOption);
		js.executeScript("arguments[0].click();", activeOption);

		// 8.click save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		// 9.handle error pop up
		WebElement errorPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='slds-media slds-media_center slds-has-flexi-truncate'])[2]")));

		System.out.println("Error popup: " + errorPopup.getText());

		// 10. Find the field that caused error (example:Name is required)
		WebElement legalNameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
		legalNameField.clear();
		legalNameField.sendKeys("Likhith Enterprises");

		// save the entries
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
