package week8.day1.pages;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import week8.day1.base.BaseClass;

public class CreateAccountPage extends BaseClass {

	@And("enter account name {string}")
	public CreateAccountPage enterAccountName(String accName) {
		getter().findElement(By.xpath("//span[text()='Account Name']/following::input[1]")).sendKeys(accName);
		return this;
	}
	 @And("Click on the CreateLead button")
	public ViewAccountPage clickCreateAccountButton() {
		 getter().findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewAccountPage();

	}

}
