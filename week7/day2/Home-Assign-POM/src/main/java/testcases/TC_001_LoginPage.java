package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;


public class TC_001_LoginPage extends ProjectSpecificMethod {
	
	@Test
    public void runLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA();

}
}
