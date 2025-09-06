package week8.day1.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import week8.day1.base.BaseClass;

public class MyAccountPage extends BaseClass{
	
	@And ("Click on the CreateAccounts link")
	public CreateAccountPage clickcreateAccountsLink()
	{
		getter().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
				    
	}

}
