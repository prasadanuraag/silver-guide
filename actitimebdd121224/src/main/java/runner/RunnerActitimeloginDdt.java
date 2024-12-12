package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		        features = "featurefiles/ActitimeloginDDT.feature",
		        glue="stepdefinitions",dryRun=false
		)

public class RunnerActitimeloginDdt extends AbstractTestNGCucumberTests {

}