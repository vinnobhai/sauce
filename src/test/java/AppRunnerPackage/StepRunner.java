package AppRunnerPackage;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		tags="@Customer",
        glue = {"StepDefinations"}, 
        plugin = { "html:target/cucumber-html-report1",
        		"json:target/cucumber-reports1/cucumber.json",
        		"junit:target/cucumber-reports1/cucumber.xml"
		
		}, monochrome = true)
public class StepRunner {

}
