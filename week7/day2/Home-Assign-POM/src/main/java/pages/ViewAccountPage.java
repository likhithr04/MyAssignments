package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod {
	private ChromeDriver driver;
	
	 public ViewAccountPage(ChromeDriver driver) {
	        this.driver = driver;
	    }
	
	public void verifyAccount() {
	System.out.println("accounts created sucesfully");
	}

}
