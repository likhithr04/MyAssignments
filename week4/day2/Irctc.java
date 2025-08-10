package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable.notifcations");
		ChromeDriver driver = new ChromeDriver(option);
		// load URL
		driver.get("https://www.irctc.co.in");// load url
		driver.manage().window().maximize();
		// wait to load elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		// open new window
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> alladdress = driver.getWindowHandles();
		List<String> address = new ArrayList<String>(alladdress);
		// switch to new window
		driver.switchTo().window(address.get(1));
		String childtitle = driver.getTitle();
		// print the title
		System.out.println("title\n" + childtitle);
		driver.switchTo().window(address.get(0));
		driver.close();

	}

}
