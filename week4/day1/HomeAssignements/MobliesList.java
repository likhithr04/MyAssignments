package week4.day1.HomeAssignements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobliesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");// load url
		driver.manage().window().maximize();
		// search in list
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
		List<Integer> priceList = new ArrayList<>();
       //list to get the prices
		for (WebElement e : prices) {
			String priceText = e.getText().replaceAll("[^0-9]", ""); // remove ₹, commas
			if (!priceText.isEmpty()) {
				priceList.add(Integer.parseInt(priceText)); // ✅ add the numeric value
			}
		}
		Collections.sort(priceList);
		System.out.println("Sorted prices: " + priceList);
		System.out.println("Lowest price: " + priceList.get(0));

	}

}
