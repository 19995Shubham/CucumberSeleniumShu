package ShubhamCucumber.utils;

import ShubhamCucumber.pageObjects.GenericUtil;
import ShubhamCucumber.pageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TextContextSetup {

    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;
    public String productText;
    public PageObjectManager pageObjectManager;
    public GenericUtil genericUtil;
    public TestBase testbase;


    public TextContextSetup() throws IOException
    {
        testbase = new TestBase();
        genericUtil = new GenericUtil(testbase.WebDriverManager());
        pageObjectManager = new PageObjectManager(testbase.WebDriverManager(),genericUtil);

    }

}
