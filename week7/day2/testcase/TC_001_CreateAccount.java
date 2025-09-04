package week7.day2.testcase;

import org.testng.annotations.Test;

import week7.day2.BaseClass.ProjectSpecificMethods;
import week7.day2.pages.LoginPage;


public class TC_001_CreateAccount extends ProjectSpecificMethods{

	@Test
	public void createLead() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickCreateAccountsLink()
		.createAccountsLink()
		.enterAccountName()
		.clickCreateAccountButton()
		.verifyAccount();
	}
}
