package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", // More readable console output
                  "html:target/site/cucumber-pretty.html" // HTML report output
        },
        dryRun = false // If true, checks for missing step definitions without running tests
)

public class TestRunnersWithPlugin extends AbstractTestNGCucumberTests {
}
