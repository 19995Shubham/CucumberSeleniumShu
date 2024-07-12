package ShubhamCucumber.cucumberOptions;

import io.cucumber.java.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseClass {

   static WebDriver driver;

BaseClass(){
    this.driver =driver;
}
    @BeforeClass
    public void launchDriver() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Retrieve the browser version
        Capabilities capabilities = ((ChromeDriver) driver).getCapabilities();
       // String chromeVersion = capabilities.getVersion(); // For older Selenium versions
        // Or
        String chromeVersion = capabilities.getCapability("browserVersion").toString(); // For newer Selenium versions

        // Print the Chrome version
        System.out.println("Chrome version: " + chromeVersion);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}





