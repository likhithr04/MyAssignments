package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	
	@DataProvider
    public String[][] sendData()
    {
		String data[][] = new String[2][3];
		data[0][0]="Google";
		data[0][1]="Likhith ";
		data[0][2]="R";
		
		data[1][0]="TestLeaf";
		data[1][1]="Hari ";
		data[1][2]="R";
		
		return data;
    }
	
	@Test(dataProvider="sendData")
	public void createLeads(String companyname,String firstname,String lastname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
}
}






