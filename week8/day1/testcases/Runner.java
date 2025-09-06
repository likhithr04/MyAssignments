package week8.day1.testcases;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import week8.day1.base.BaseClass;


@CucumberOptions(features = "src/main/java/features",glue="pages",monochrome = true,publish = true)
public class Runner extends BaseClass {

}




