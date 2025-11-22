package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        plugin = {
                "pretty", // More readable output to the console
                "html:target/cucumber-report-regression.html",
                "json:target/cucumber-report-regression.json"
        },
        dryRun = false // true, it will only check for missing step definitions
)
public class TestRunnerRegression extends AbstractTestNGCucumberTests {
}
