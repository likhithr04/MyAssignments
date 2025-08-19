package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://erail.in/");

		// maximize the browser
		driver.manage().window().maximize();

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Locate the from table
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
        fromStation.clear();   // clear old value
        fromStation.sendKeys("MAS\n");  // \n to select station from dropdown
        
        // Locate the To Table
        WebElement toStation = driver.findElement(By.id("txtStationTo"));
        toStation.clear();
        toStation.sendKeys("MDU\n");
        
        //Uncheck "Sort on Date"
        WebElement sortDate = driver.findElement(By.id("chkSelectDateOnly"));
        if(sortDate.isSelected())
        {
        	sortDate.click();
        }
        
        Thread.sleep(2000); // wait for table to reload
        //  Locate the table (train list table)
        WebElement trainTable = driver.findElement(By.xpath("//*[@id=\"divTrainsList\"]/table[1]"));
        
        //  Get all train name elements (2nd column of the table)
        List<WebElement> trainName = trainTable.findElements(By.xpath(".//tr/td[2]"));
        
        System.out.println("Total trains found: " + trainName.size());
        
        Set<String> uniqueTrains = new HashSet<>();
        boolean hasDuplicate = false;
        
        for (WebElement train : trainName) {
            String trainName1 = train.getText().trim();
            
            // Try adding to Set (returns false if duplicate)
            if (!uniqueTrains.add(trainName1)) {
                System.out.println("Duplicate found: " + trainName1);
                hasDuplicate = true;
            }
        }
        System.out.println("List of trains names \n"+uniqueTrains);
        //  Verify and print result
        if (hasDuplicate) {
            System.out.println("✅ There are duplicate train names.");
        } else {
            System.out.println("❌ No duplicates. All train names are unique.");
        }
        
	}

}
