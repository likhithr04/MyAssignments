package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}

}
