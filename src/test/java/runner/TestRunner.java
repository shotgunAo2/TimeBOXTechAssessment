package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/"},
        glue={"stepDefinitions"},
        plugin = {
                "html:target/cucumber-report/cucumber.html",
        },
        publish = true,
        monochrome = true
)

public class TestRunner {

}
