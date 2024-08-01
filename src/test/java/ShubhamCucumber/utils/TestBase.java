package ShubhamCucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public  WebDriver WebDriverManager() throws IOException {
        if (driver.get() == null) {
           // File fls = new File("src/test/resources/global.properties");
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
            //FileInputStream fis = new FileInputStream(fls);
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("QAURl");
            String browserName = properties.getProperty("browser");

            if (browserName.equalsIgnoreCase("Chrome")) {
                WebDriver webDriver = new ChromeDriver();
                driver.set(webDriver);
                  webDriver.manage().window().maximize();
                  webDriver.manage().deleteAllCookies();
                  webDriver.get(url);

            }
        }
       return getDriver();
    }

    public synchronized WebDriver getDriver() throws IOException {
        return driver.get();
    }

    public void removeDriver() throws IOException {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }



}
