package week6.day2.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/week6/day2/features/Login.feature",glue="week6.day2.StepDefination",monochrome=true,publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	

}
