import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/features", 
glue = {"steps"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags =  "@active"
		)

public class Runnertest {

}