package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");
    By topDeals = By.cssSelector("a.cart-header-navlink[href=\"#/offers\"]");

    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
    }

    public void getProductText(){
        driver.findElement(search).getText();
    }
    public String  getProductName(){
       String landingPageProductName =  driver.findElement(productName).getText().split(" ")[0].trim();
       return landingPageProductName;
    }

    public void topDeals(){
        driver.findElement(topDeals).click();
    }

    public String getTitleLandingPage()
    {
        return driver.getTitle();
    }
}
