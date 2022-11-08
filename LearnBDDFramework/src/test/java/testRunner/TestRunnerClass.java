package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\login.feature",
                 glue="stepDefintion"
                 //dryRun = true
)
public class TestRunnerClass {

}
