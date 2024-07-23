package ShubhamCucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager()throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
        Properties properties = new Properties();
        properties.load(fis);
        String url = properties.getProperty("QAURl");
        String browserName = properties.getProperty("browser");

        if(url == null || browserName == null){
            throw new RuntimeException("Check global properties files");
        }

        if(browserName.equalsIgnoreCase("Chrome")) {
            if (driver == null) {
                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().window().maximize();
            }
        }
        return driver;
    }
}
