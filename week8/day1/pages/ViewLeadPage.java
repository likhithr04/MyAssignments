package week8.day1.pages;

import io.cucumber.java.en.Then;
import week8.day1.base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	@Then("Lead should be created")
	public void verifyLead() {
		System.out.println("Lead is created");

	}

}
