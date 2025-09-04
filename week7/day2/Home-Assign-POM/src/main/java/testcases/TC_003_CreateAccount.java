package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethod {

	@Test
	public void createLead() {
		LoginPage lp=new LoginPage(driver);
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
