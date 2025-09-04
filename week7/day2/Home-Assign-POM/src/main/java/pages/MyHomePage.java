package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	private ChromeDriver driver;

	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyAccountPage clickCreateAccountsLink() {
		driver.findElement(By.linkText("Create Account")).click();
		return new MyAccountPage(driver);
	}

}
