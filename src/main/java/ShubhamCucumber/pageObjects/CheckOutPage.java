package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage {

    WebDriver driver;


    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    By cartBag = By.cssSelector("[alt='Cart']");
    By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promoBtn = By.cssSelector(".promoBtn");
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");




    public void CheckoutItems() throws InterruptedException {
        driver.findElement(cartBag).click();

        Thread.sleep(4000);
        driver.findElement(checkOutButton).click();
        Thread.sleep(4000);
    }

    public Boolean VerifyPromoBtn()
    {
        return driver.findElement(promoBtn).isDisplayed();
    }

    public Boolean VerifyPlaceOrder()
    {
        return driver.findElement(placeOrder).isDisplayed();
    }


}
