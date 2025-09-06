package week8.day1.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import week8.day1.base.BaseClass;


public class MyHomePage extends BaseClass {
	
	@And("Click on the Leads link")
public MyLeadsPage clickLeadsLink() {
		getter().findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
    }
	
	@And("Click on the Accounts link") 
	public MyAccountPage clickAccountsLink() {
		getter().findElement(By.linkText("Create Account")).click();
		return new MyAccountPage();
	    }

}
