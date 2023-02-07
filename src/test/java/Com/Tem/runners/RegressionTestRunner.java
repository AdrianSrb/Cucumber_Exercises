package Com.Tem.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "classpath:feature",
        features = "src/test/resources",
        glue = {"StepDeff"},
        plugin = {"html:target/cucumber-pretty-raport/regression-tests",
        "json:target/cucumber.json"},
       tags = "@Regression"
)

public class RegressionTestRunner {


}
//
// Video OOP2 si Junit Test Runner