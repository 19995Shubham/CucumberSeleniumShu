package ShubhamCucumber.stepDef;

import ShubhamCucumber.pageObjects.CheckOutPage;
import ShubhamCucumber.pageObjects.OffersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.TextContextSetup;

public class CheckOutPageStepDefinition {
    TextContextSetup textContextSetup;
    CheckOutPage checkOutPage;

    public CheckOutPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
        this.checkOutPage = textContextSetup.pageObjectManager.getCheckOutPage();
    }



    @And("verify user has ability to enter promo code and place the order")
    public void verifyUserHasAbilityToEnterPromoCodeAndPlaceTheOrder() {
        Assert.assertTrue(checkOutPage.VerifyPromoBtn());
        Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
    }

    @Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
    public void userProceedsToCheckoutAndValidateTheNameItemsInCheckoutPage(String productName) throws InterruptedException {
        checkOutPage.CheckoutItems();

    }
}
