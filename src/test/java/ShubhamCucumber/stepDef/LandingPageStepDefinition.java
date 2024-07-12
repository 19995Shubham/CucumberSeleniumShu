package ShubhamCucumber.stepDef;

import ShubhamCucumber.pageObjects.LandingPage;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import utils.TextContextSetup;



public class LandingPageStepDefinition {

    LandingPage landingPage;
    TextContextSetup textContextSetup;

    public LandingPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    @Given("User is on Greenkart landing page")
    public void user_is_on_greenkart_landing_page() {
        textContextSetup.driver = new ChromeDriver();
        textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        textContextSetup.driver.getTitle();
        System.out.println("I am on green kart page");
    }

    @When("^User searched with shortname (.+) and extracted actual result$")
    public void userSearchedWithShortnameAndExtractedActualResult(String shortName) throws InterruptedException {

        landingPage = new LandingPage(textContextSetup.driver);
        landingPage.searchItem(shortName);
        Thread.sleep(3000);
        textContextSetup.landingPageProductName = landingPage.getProductName();
        textContextSetup.productText = shortName;
        System.out.println("i searched for productName "+ textContextSetup.productText + " and extracted the text " + textContextSetup.landingPageProductName);
    }

}
