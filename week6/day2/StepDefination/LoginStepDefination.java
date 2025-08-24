package week6.day2.StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	public ChromeDriver driver;
	public ChromeOptions options;
	@Given("Launch the browser")
	public void launch_the_browser() {
		options=new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    
	}

	@Given("username as Demomanager")
	public void username_as_demomanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    
	}
	@Given("password as crmfsa")
	public void password_as_crmfsa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	}

	@When("click on enter button")
	public void click_on_enter_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}

	@Then("it should be able to login")
	public void it_should_be_able_to_login() {
		System.out.println("login sucessfull");
	    
	}

}
