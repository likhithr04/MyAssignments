package week3.day2;

public class Reporter {

	public void reportStep(String msg, String status) {
		System.out.println("inside first report step");
		System.out.println(msg);
		System.out.println(status);
	}

	public void reportStep(String msg, String status, boolean snapshot) {
		System.out.println("inside second report step");
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snapshot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reporter r = new Reporter();
		r.reportStep("Login successful", "PASS");
		r.reportStep("Form submission failed", "FAIL", true);
	}

}
