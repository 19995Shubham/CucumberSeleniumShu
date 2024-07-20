package ShubhamCucumber.stepDef;

import ShubhamCucumber.pageObjects.LandingPage;
import ShubhamCucumber.pageObjects.PageObjectManager;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import utils.TextContextSetup;



public class LandingPageStepDefinition {

    LandingPage landingPage;
    TextContextSetup textContextSetup;

    public LandingPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
        this.landingPage = textContextSetup.pageObjectManager.getLandingPage();
    }

    @Given("User is on Greenkart landing page")
    public void user_is_on_greenkart_landing_page() {

        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
    }

    @When("^User searched with shortname (.+) and extracted actual result$")
    public void userSearchedWithShortnameAndExtractedActualResult(String shortName) throws InterruptedException {

        landingPage.searchItem(shortName);
        Thread.sleep(3000);
        textContextSetup.landingPageProductName = landingPage.getProductName();
        textContextSetup.productText = shortName;
        System.out.println("i searched for productName "+ textContextSetup.productText + " and extracted the text " + textContextSetup.landingPageProductName);
    }

}
