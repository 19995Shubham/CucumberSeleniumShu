package ShubhamCucumber.utils;

import ShubhamCucumber.pageObjects.GenericUtil;
import ShubhamCucumber.pageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TextContextSetup extends TestBase {

    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;
    public String productText;
    public PageObjectManager pageObjectManager;
    public GenericUtil genericUtil;
    public TestBase testBase;

    public TextContextSetup() throws IOException {
       testBase = new TestBase();
       driver = testBase.WebDriverManager();
        genericUtil = new GenericUtil(driver);
        pageObjectManager = new PageObjectManager(driver, genericUtil);
    }

}
