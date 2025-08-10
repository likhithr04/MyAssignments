package week4.day2.HomeAssignments;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		// loading URL and waiting for every element for 10s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");// switch to i-frame

		// Click the "Try it" button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Handle the prompt alert
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Likhith");
		prompt.accept();

	}

}
