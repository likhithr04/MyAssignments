package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.BaseClass.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods{
	
	public CreateAccountPage createAccountsLink()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
				    
	}

}
