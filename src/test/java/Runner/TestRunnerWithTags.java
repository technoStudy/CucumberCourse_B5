package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (

        tags = "@Regression or @Smoke", // These tags are coming from runner class and it's able to find which scenarios to execute
        features = {"src/test/java/FeatureFile"},
        glue = {"StepDefinition"},
        plugin = {"html:target/report/RegressionResult.html"}

)

public class TestRunnerWithTags extends AbstractTestNGCucumberTests {
}
