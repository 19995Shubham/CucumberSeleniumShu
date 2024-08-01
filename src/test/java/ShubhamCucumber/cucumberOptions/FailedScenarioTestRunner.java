package ShubhamCucumber.cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "@target/failed_scenarios.text",glue = "ShubhamCucumber/stepDef",
        monochrome = true,
        plugin = {"html:target/cucumber.html","json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedScenarioTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {

        return super.scenarios();
    }

}
