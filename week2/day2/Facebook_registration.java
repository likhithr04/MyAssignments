package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Facebook_registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver =new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        
		driver.findElement(By.name("firstname")).sendKeys("Sheldon");
		driver.findElement(By.name("lastname")).sendKeys("Cooper");
		
		WebElement element = driver.findElement(By.id("day"));
		Select day =new Select(element);
		day.selectByValue("26");
		
		WebElement element2 = driver.findElement(By.id("month"));
		Select month =new Select(element2);
		month.selectByVisibleText("Feb");
		
		WebElement element3 = driver.findElement(By.id("year"));
		Select year =new Select(element3);
		year.selectByValue("1980");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("venon43164@kloudis.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Likhith@1998");
		
		
	}

}
