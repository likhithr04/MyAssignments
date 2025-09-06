package week8.day1.pages;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import week8.day1.base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	@And("Click on the CreateLead link")
public CreateLeadPage clickCreateLeadLink() {
		getter().findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage();
    }

}
