package week3.day2.HomeAssignements;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		System.out.println("Method overridden in login class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}

}
