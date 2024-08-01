package ShubhamCucumber.cucumberOptions;

import ShubhamCucumber.listner.CucumberExecutionListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/ShubhamCucumber/feature",glue = "ShubhamCucumber/stepDef",
        monochrome = true, tags = "@PlaceOrder or @SearchOrder",
        plugin = {"html:target/cucumber.html","json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_scenarios.text"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {

        return super.scenarios();
    }
// use @BeforeMethod to run in parallel to launch the browser
// use @BeforeSuit to run in sequential (in single browser)
    @BeforeMethod
    public void setUp(){
        new CucumberExecutionListener().onExecutionStart();
    }

    //to run in parallel mode use @AfterMethod to quit all browser
    //to run in sequential use @AfterSuit to quit the browser
    @AfterMethod
    public void tearDown(){
        new CucumberExecutionListener().onExecutionFinish();
    }

}
