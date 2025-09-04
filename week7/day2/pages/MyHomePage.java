package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.BaseClass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
public MyAccountPage clickCreateAccountsLink() {
	driver.findElement(By.linkText("Create Account")).click();
	return new MyAccountPage();
    }

}
