package week8.day1.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week8.day1.base.BaseClass;
import week8.day1.pages.common.LoginPage;

public class TC_001_Accounts extends BaseClass {

	@BeforeTest
	public void setValues() {
		fileName="CreateAccount";

	}
	
	
	
	@Test(dataProvider = "sendData")
	public void createLead(String uName, String pWord, String accName) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.clickCRMSFA()
		.clickAccountsLink()
		.clickcreateAccountsLink()
		.enterAccountName(accName)
		.clickCreateAccountButton()
		.verifyAccount();
	}
}
