package runner;

import org.junit.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "FeatureFileFolder"
		,glue = {"stepDefinition"},
		plugin = { "pretty", "html:target/Cucu.html" }
		//monochrome = true
	)


public class RunnerWithTestNG extends AbstractTestNGCucumberTests{
	
@Test
public void f() {
	
}

}
