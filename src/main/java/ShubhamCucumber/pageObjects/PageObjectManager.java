package ShubhamCucumber.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {


    WebDriver driver;
    LandingPage landingPage;
    OffersPage offersPage;

    public  PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage getLandingPage(){
         landingPage = new LandingPage(driver);
         return landingPage;
    }

    public OffersPage getOfferPage(){
        offersPage = new OffersPage(driver);
        return offersPage;
    }

    public OffersPage getOffersPage(){
        offersPage = new OffersPage(driver);
        return offersPage;
    }
}
