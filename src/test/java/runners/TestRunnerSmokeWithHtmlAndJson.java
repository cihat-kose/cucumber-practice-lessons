package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = "src/test/java/features",
        glue = "stepDefinitions",
        plugin = {
                "pretty", // More readable output in the console
                "html:target/reports/smoke-html-report.html", // HTML report output
                "json:target/reports/smoke-json-report.json"  // JSON report output
        },
        dryRun = false // If true, checks for missing step definitions without running tests
)
public class TestRunnerSmokeWithHtmlAndJson extends AbstractTestNGCucumberTests {
}
