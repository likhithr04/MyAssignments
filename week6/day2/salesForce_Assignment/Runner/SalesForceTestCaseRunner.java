package salesForce_Assignment.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/salesForce_Assignment/features",glue="salesForce_Assignment/Steps",monochrome=true,publish=true)
public class SalesForceTestCaseRunner extends AbstractTestNGCucumberTests{

}
