package ShubhamCucumber.stepDef;


import ShubhamCucumber.pageObjects.LandingPage;
import ShubhamCucumber.pageObjects.OffersPage;
import io.cucumber.java.en.Then;

import org.testng.Assert;
import ShubhamCucumber.utils.TextContextSetup;


public class OffersPageStepDefinition {

    TextContextSetup textContextSetup;
    OffersPage offersPage;
    LandingPage landingPage;

    public OffersPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
        this.offersPage = textContextSetup.pageObjectManager.getOffersPage();
        this.landingPage = textContextSetup.pageObjectManager.getLandingPage();
    }


    @Then("User searched for the same shortname in offers page to check if product is exist")
    public void User_searched_for_the_same_shortname_in_offers_page_to_check_if_product_is_exist() throws InterruptedException {
         switchOfferPage();
         offersPage.searchItem(textContextSetup.productText);
         textContextSetup.offerPageProductName = offersPage.getProductName();
    }

    public void switchOfferPage() throws InterruptedException {
        offersPage.getTopDeals();
        Thread.sleep(5000);
        textContextSetup.genericUtil.switchPageToChildWindow();
    }

    @Then("Validate productName matches the offerPage with landingPage")
    public void validateProductNameMatchesTheOfferPageWithLandingPage() throws InterruptedException {

        Assert.assertEquals(textContextSetup.offerPageProductName, textContextSetup.landingPageProductName);
        Thread.sleep(5000);
        textContextSetup.genericUtil.switchPageToParentWindow();
        Thread.sleep(5000);
    }
}
