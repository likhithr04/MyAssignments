package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_LogoutPage extends ProjectSpecificMethod {

	@Test
    public void runLogout() {
		LoginPage lp=new LoginPage(driver);
            lp.enterUsername()
            .enterPassword()
            .clickLoginButton()
            .clickLogout(); 
    }
}
