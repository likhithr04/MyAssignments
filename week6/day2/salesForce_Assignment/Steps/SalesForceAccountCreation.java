package salesForce_Assignment.Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceAccountCreation {

	public ChromeDriver driver;
	public WebDriverWait wait;

	@When("the user logs in with valid credentials")
	public void the_user_logs_in_with_valid_credentials() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// load url
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
	}

	@When("the user clicks on the toggle menu button from the left corner")
	public void the_user_clicks_on_the_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		driver.findElement(By.xpath("//button[.//span[text()='App Launcher']]")).click();
		Thread.sleep(5000);
	}

	@When("the user clicks on 'View All' and selects 'Sales' from App Launcher")
	public void the_user_clicks_on_and_selects_from_app_launcher() throws InterruptedException {
		// click on view all button
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);

		// search for sales app
		driver.findElement(By.xpath("(//input[contains(@class,'slds-input')])[2]")).sendKeys("Sales");
		Thread.sleep(5000);

		// click on sales icon
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[3]")).click();
		Thread.sleep(5000);
	}

	@When("the user navigates to the Accounts tab")
	public void the_user_navigates_to_the_accounts_tab() {
		WebElement accountsTab = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//one-app-nav-bar-item-root//a[@title='Accounts']")));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(accountsTab)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountsTab);
		}
	}

	@When("the user clicks on the New button")
	public void the_user_clicks_on_the_new_button() throws InterruptedException {
		  driver.findElement(By.xpath("//div[text()='New']")).click();
	        Thread.sleep(5000);
	}

	@When("the user enters {string} as account name")
	public void the_user_enters_as_account_name(String accountName) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Likhith");
        Thread.sleep(3000);
	}

	@When("the user selects Ownership as {string}")
	public void the_user_selects_ownership_as(String ownership) {
		 // Open Ownership dropdown
        WebElement ownershipDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='Ownership']")));
        ownershipDropdown.click();

        // select public option
        WebElement publicOption = wait.until(ExpectedConditions
        	    .visibilityOfElementLocated(By.xpath("//lightning-base-combobox-item//span[text()='Public']"))
        	);
        	((JavascriptExecutor) driver).executeScript("arguments[0].click();", publicOption);
	}

	@When("the user clicks on Save")
	public void the_user_clicks_on_save() {
		 WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[@name='SaveEdit']")));
	        saveBtn.click();
	}

	@Then("the account name should be displayed as {string}")
	public void the_account_name_should_be_displayed_as(String expectedName) {
		WebElement accountHeader = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[@slot='primaryField']")));
		String actualName = accountHeader.getText();
		System.out.println("Created Account Name: " + actualName);

		if (!actualName.equals(expectedName)) {
			throw new AssertionError("Expected: " + expectedName + " but found: " + actualName);
		}
	}
}
