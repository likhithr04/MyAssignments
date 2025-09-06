package week8.day1.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import week8.day1.utils.ReadExcel;


public class BaseClass extends AbstractTestNGCucumberTests {
public static ChromeDriver driver;
public static ChromeOptions options ;

private static final ThreadLocal<ChromeDriver> eDriver = new ThreadLocal<ChromeDriver>();

public void setter() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("Guest");
	eDriver.set(new ChromeDriver(options));

}

public ChromeDriver getter() {
	ChromeDriver driver = eDriver.get();
	return driver;
}

public String fileName;

@BeforeMethod
public void preConditions() {
	setter(); 
	getter().get("http://leaftaps.com/opentaps/control/main");
	getter().manage().window().maximize();

}

@AfterMethod
public void postConditions() {
	getter().close();

}

@DataProvider
public String[][] sendData() throws IOException {

	// String[][] readData = ReadExcel.readData();
	// return readData;
	return ReadExcel.readData(fileName); // CreateLead

}


}
