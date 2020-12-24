package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/app/features/Gmail.feature"},
		glue = {"stepdefinations"},
		tags = "@All",
		plugin = {"pretty"}
		)

public class GmailHomePageTest {

}


