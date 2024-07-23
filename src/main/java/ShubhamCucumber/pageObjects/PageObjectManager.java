package ShubhamCucumber.pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {


    WebDriver driver;
    LandingPage landingPage;
    OffersPage offersPage;
    CheckOutPage checkOutPage;
    GenericUtil genericUtil;

    public  PageObjectManager(WebDriver driver, GenericUtil genericUtil){

        this.driver = driver;
        this.genericUtil = genericUtil;
    }




    public LandingPage getLandingPage(){
         landingPage = new LandingPage(driver,genericUtil);
         return landingPage;
    }


    public OffersPage getOffersPage(){
        offersPage = new OffersPage(driver,genericUtil);
        return offersPage;
    }

    public CheckOutPage getCheckOutPage(){
        checkOutPage = new CheckOutPage(driver,genericUtil);
        return checkOutPage;
    }
}
