package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


// Runners are helping us to run multiple feature files at the same time

@CucumberOptions (

        features = {"src/test/java/FeatureFile/Login.feature"}, // Location of Feature file we want to execute
        glue = {"StepDefinition"}, // Location of Step Definitions
        plugin = {"html:target/report/index.html"}

)


public class TestRunner extends AbstractTestNGCucumberTests {
}
