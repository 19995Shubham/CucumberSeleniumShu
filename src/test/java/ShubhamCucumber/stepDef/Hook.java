package ShubhamCucumber.stepDef;

import ShubhamCucumber.utils.TextContextSetup;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hook {

    public TextContextSetup textContextSetup;

    public Hook(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }


//    @After
//    public void quit() throws IOException {
//       // TestBase.removeDriver();
//    }


    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = textContextSetup.testBase.WebDriverManager();
        if (scenario.isFailed()) {
            //screenshot
            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image");

        }

    }
}

