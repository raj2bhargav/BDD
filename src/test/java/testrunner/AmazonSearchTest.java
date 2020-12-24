package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"src/test/resources/app/features/Amazon.feature"},
		glue = {"stepdefinations","MyHooks"},
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"},
		publish = true
		//monochrome = true
		)

public class AmazonSearchTest {

}
