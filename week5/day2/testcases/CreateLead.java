package week5.day2.testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends TryAnotationsBaseClass {

	@Test
	public void createLead() {
		
		System.out.println("inside test case1");
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






