package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_LogoutPage extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
	    fileName = "CreateAccountData";
	}

	@Test(dataProvider = "fetchData")
    public void runLogout(String username, String password,String accName) {
		LoginPage lp=new LoginPage(driver);
            lp.enterUsername(username)
            .enterPassword(password)
            .clickLoginButton()
            .clickLogout(); 
    }
}
