package week4.day2.HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		// opening web page and doing basic login functionality
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();//
		driver.findElement(By.linkText("Merge Contacts")).click();
		// click on new pop-up icon
		driver.findElement(By.xpath("//a[img[@alt='Lookup']]")).click();
		Set<String> alladdress = driver.getWindowHandles();
		List<String> address = new ArrayList<String>(alladdress);
		driver.switchTo().window(address.get(1));// switching to child window

		// Wait for result link to appear
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='linktext']")));

		// Click on the first contact in results
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(address.get(0));

		// Store the parent window handle foe second pop-up link
		String parentWindow = driver.getWindowHandle();

		// Click the second lookup icon
		driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[2]/parent::a")).click();

		// Switch to the new pop-up window
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Wait until "FrenchCustomer" is click able and click it
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.linkText("FrenchCustomer"))).click();

		// Switch back to the main window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("Merge")).click();
		// switching to alert and accepting it
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();

	}

}
