package week3.day2;

public class Browser {

	String browserName = "Chrome";
	int browserVersion = 40;

	public void openURL() {
		System.out.println("browser url is opned");
		System.out.println("browser name\n" + browserName);
		System.out.println("browser version\n" + browserVersion);
	}

	public void closeBrowser() {
		System.out.println("browser is closed");
	}

	public void navigateBack() {
		System.out.println("nagivation is sucesfull ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser b = new Browser();
		b.openURL();
		b.navigateBack();
		b.closeBrowser();

	}

}
