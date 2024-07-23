package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;
    GenericUtil genericUtil;

    public LandingPage(WebDriver driver, GenericUtil genericUtil){
        this.driver = driver;
        this.genericUtil = genericUtil;
    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");
    By topDeals = By.cssSelector("a.cart-header-navlink[href=\"#/offers\"]");
    By increment = By.cssSelector(".increment");
    By addToCart = By.cssSelector(".product-action button");

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

    public void incrementQuantity(int quantity){
        int i = 1;
        while (i < quantity){
            driver.findElement(increment).click();
            i++;
        }
    }

    public void addToCart(){
        driver.findElement(addToCart).click();
    }
}
