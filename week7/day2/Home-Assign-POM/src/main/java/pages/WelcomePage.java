package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;


public class WelcomePage extends ProjectSpecificMethod {
	
	private ChromeDriver driver;
	 public WelcomePage(ChromeDriver driver) {
	        this.driver = driver;
	    }
	 
public MyHomePage clickCRMSFA() {
	driver.findElement(By.partialLinkText("CRM")).click();
	return new MyHomePage(driver);
    }

public LoginPage clickLogout() {
    driver.findElement(By.className("decorativeSubmit")).click();
    return new LoginPage(driver); // after logout, return to LoginPage
}

}
