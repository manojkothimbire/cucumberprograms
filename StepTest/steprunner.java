package StepTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)				
@CucumberOptions(
	    features= {"./FeatureFolder"},
	    glue = {"Stepdefination.stepdef"})

public class steprunner {

}
