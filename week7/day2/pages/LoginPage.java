package week7.day2.pages;
import org.openqa.selenium.By;

import week7.day2.BaseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
