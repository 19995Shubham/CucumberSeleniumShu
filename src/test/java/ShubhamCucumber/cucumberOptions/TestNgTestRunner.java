package ShubhamCucumber.cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/ShubhamCucumber/feature",glue = "ShubhamCucumber/stepDef",
        monochrome = true)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
