package week7.day2.pages;

import org.openqa.selenium.By;
import week7.day2.BaseClass.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods {

	public CreateAccountPage enterAccountName() {
		driver.findElement(By.xpath("//span[text()='Account Name']/following::input[1]")).sendKeys("testleaf");
		return this;
	}

	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewAccountPage();

	}

}
