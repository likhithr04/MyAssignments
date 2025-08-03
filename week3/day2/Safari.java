package week3.day2;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("reader mode enabled");
	}

	public void fullScreenMode() {
		System.out.println("full screen mode enabled  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Safari s = new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.takeSnap();
		s.clearCookies();
		s.openIncognito();
		s.clearCache();
		s.openURL();
		s.navigateBack();
		s.closeBrowser();
	}

}
