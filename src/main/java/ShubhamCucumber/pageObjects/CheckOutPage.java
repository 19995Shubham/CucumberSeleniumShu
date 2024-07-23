package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage {

    WebDriver driver;
    GenericUtil genericUtil;


    public CheckOutPage(WebDriver driver,GenericUtil genericUtil){
        this.driver = driver;
        this.genericUtil = genericUtil;
    }

    By cartBag = By.cssSelector("[alt='Cart']");
    By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promoBtn = By.cssSelector(".promoBtn");
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");




    public void CheckoutItems()  {
        genericUtil.waitForElementToAppear(cartBag);
        driver.findElement(cartBag).click();
        genericUtil.waitForElementToAppear(checkOutButton);
        driver.findElement(checkOutButton).click();

    }

    public Boolean VerifyPromoBtn()
    {
        genericUtil.waitForElementToAppear(promoBtn);
        return driver.findElement(promoBtn).isDisplayed();
    }

    public Boolean VerifyPlaceOrder()
    {
        genericUtil.waitForElementToAppear(placeOrder);
        return driver.findElement(placeOrder).isDisplayed();
    }

}
