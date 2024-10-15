package CodingInterview.Selenium;

import org.openqa.selenium.WebDriver;

public abstract class MethodOverridenLApp {

    WebDriver driver;
    public MethodOverridenLApp(WebDriver driver){
        this.driver = driver;
    }


    public abstract void getPagetitle();

    public abstract void getPageUrl();
}
