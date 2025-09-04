package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {

	private ChromeDriver driver;

	public CreateAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateAccountPage enterAccountName() {
		driver.findElement(By.xpath("//span[text()='Account Name']/following::input[1]")).sendKeys("testleaf");
		return this;
	}

	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewAccountPage(driver);

	}

}
