package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features={"src/test/resources/features/MobileApp_Login.feature"}, 
glue = {"steps"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports/report.html"}
//tags =  "@functional"
		)

public class TestRunner {

}
