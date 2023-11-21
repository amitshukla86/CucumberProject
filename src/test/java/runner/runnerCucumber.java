package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/parabankLogin.feature",glue="stepDefinitions",plugin={"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun=false,tags="")
public class runnerCucumber extends AbstractTestNGCucumberTests {

}
