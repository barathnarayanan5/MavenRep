package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile/OrangeHrm.feature", glue = "stepDefinitons",monochrome = true)
public class OpenGoogleRun {

	
	
}
