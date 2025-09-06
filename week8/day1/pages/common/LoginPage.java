package week8.day1.pages.common;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import week8.day1.base.BaseClass;

public class LoginPage extends BaseClass {

	@And("Enter the username as {string}")
	public LoginPage enterUsername(String username) {
		getter().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		return this;
	}

	@And("Enter the password as {string}")
	public LoginPage enterPassword(String password) {
		getter().findElement(By.id("password")).sendKeys(password);
		return this;
	}

	@When("Click on the Login button")
	public WelcomePage clickLoginButton() {
		getter().findElement(By.className("decorativeSubmit")).click();
		// WelcomePage wp=new WelcomePage();
		// return wp;
		return new WelcomePage();
	}

}
