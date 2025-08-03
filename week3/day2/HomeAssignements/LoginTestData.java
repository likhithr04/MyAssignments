package week3.day2.HomeAssignements;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("username entered sucesfully");
	}

	public void enterPassword() {
		System.out.println("password entered sucesfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestData testData = new TestData();
        testData.enterCredentials();
        testData.navigateToHomePage();
        
		LoginTestData data = new LoginTestData();
		data.enterCredentials();
		data.navigateToHomePage();
		data.enterUsername();
		data.enterPassword();

	}

}
