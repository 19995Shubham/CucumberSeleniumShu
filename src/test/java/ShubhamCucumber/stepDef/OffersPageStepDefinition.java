package ShubhamCucumber.stepDef;


import ShubhamCucumber.pageObjects.OffersPage;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;

import org.testng.Assert;
import utils.TextContextSetup;

import java.util.Iterator;
import java.util.Set;



public class OffersPageStepDefinition {

    TextContextSetup textContextSetup;

    OffersPage offersPage;

    public OffersPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
        offersPage = new OffersPage(textContextSetup.driver);
    }


    @Then("User searched for the same shortname in offers page to check if product is exist")
    public void User_searched_for_the_same_shortname_in_offers_page_to_check_if_product_is_exist() throws InterruptedException {
         switchOfferPage();
        offersPage.searchItem(textContextSetup.productText);
        textContextSetup.offerPageProductName = offersPage.getProductName();
    }

    public void switchOfferPage() throws InterruptedException {
//        textContextSetup.driver.findElement(By.cssSelector("a.cart-header-navlink[href=\"#/offers\"]")).click();
        Thread.sleep(5000);

        Set<String> s1 = textContextSetup.driver.getWindowHandles();

        Iterator<String> it = s1.iterator();
        String parentWindow = it.next();

        String childWindow = it.next();

        textContextSetup.driver.switchTo().window(childWindow);
    }

    @Then("Validate productName matches the offerPage with landingPage")
    public void validateProductNameMatchesTheOfferPageWithLandingPage() {

        Assert.assertEquals(textContextSetup.offerPageProductName, textContextSetup.landingPageProductName);
    }
}
