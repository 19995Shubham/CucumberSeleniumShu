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
        if(landingPage == null){
            landingPage = new LandingPage(driver,genericUtil);
        }
         return landingPage;
    }


    public OffersPage getOffersPage(){
        if (offersPage == null){
            offersPage = new OffersPage(driver,genericUtil);
        }
        return offersPage;
    }

    public CheckOutPage getCheckOutPage(){
        if (checkOutPage == null){
            checkOutPage = new CheckOutPage(driver,genericUtil);
        }
        return checkOutPage;
    }
}
