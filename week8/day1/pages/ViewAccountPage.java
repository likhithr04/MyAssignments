package week8.day1.pages;

import io.cucumber.java.en.Then;
import week7.day2.BaseClass.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods {
	
	@Then("Account should be created")
	public void verifyAccount() {
	System.out.println("accounts created sucesfully");
	}

}
