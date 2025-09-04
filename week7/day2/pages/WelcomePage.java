package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.BaseClass.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	
public MyHomePage clickCRMSFA() {
	driver.findElement(By.partialLinkText("CRM")).click();
	return new MyHomePage();
    }

}
