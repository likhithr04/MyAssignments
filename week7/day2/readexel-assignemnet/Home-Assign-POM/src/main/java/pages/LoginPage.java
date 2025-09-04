package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	private ChromeDriver driver;
	 public LoginPage(ChromeDriver driver) {
	        this.driver = driver;
	    }

	public LoginPage enterUsername(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}
