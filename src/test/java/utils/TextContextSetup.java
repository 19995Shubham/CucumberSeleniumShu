package utils;

import ShubhamCucumber.pageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;


public class TextContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;
    public String productText;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;
    public TestBase testbase;


   public TextContextSetup(){
       testbase = new TestBase();
       pageObjectManager = new PageObjectManager(testbase.webDriverManager());
       genericUtils = new GenericUtils(testbase.webDriverManager());
   }


}
