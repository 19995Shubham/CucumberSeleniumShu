package ShubhamCucumber.listner;

import ShubhamCucumber.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;

import java.io.IOException;

public class CucumberExecutionListener extends TestBase implements IExecutionListener {


    WebDriver driver;
    @Override
    public void onExecutionStart() {
        try {

           // TestBase testBase = new TestBase();
            WebDriverManager();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onExecutionFinish() {

        try {
            removeDriver();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }


