package CodingInterview.Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScreenshots {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        getScreenshot(driver);



        driver.quit();
    }
    public static void getScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourFile =  screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File( System.getProperty("user.dir") + "/reportsPractice/" + "PractieSS.png");
        FileUtils.copyFile(sourFile,destFile);
        System.out.println(destFile.getAbsolutePath());


    }

}
