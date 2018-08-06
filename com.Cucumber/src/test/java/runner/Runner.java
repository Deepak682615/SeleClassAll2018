package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFileFolder"
		,glue = {"stepDefinition"},
		plugin = { "pretty", "html:target/Cucu.html" },
		tags= {"@Sanity"},
		monochrome = true
	)



public class Runner {

}
