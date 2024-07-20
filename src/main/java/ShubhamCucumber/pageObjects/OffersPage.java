package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class OffersPage {
    WebDriver driver;
    
   public OffersPage(WebDriver driver){
       this.driver = driver;
   }

   By search = By.xpath("//input[@id='search-field' and @type='search']");
   By productName = By.xpath("//tbody/tr");
    By topDeals = By.cssSelector("a.cart-header-navlink[href=\"#/offers\"]");

    public void getTopDeals(){
        driver.findElement(topDeals).click();
    }

   public void searchItem(String productText){
       driver.findElement(search).sendKeys(productText);
   }

//   public List<WebElement> getListOfProduct(){
//       List<WebElement> textList =  driver.findElements(productName);
//       return textList;
//   }
   public String getProductName(){
       List<WebElement> textList =  driver.findElements(productName);
       String productname = "";

       for (WebElement list : textList) {
           productname = list.getText().split(" ")[0].trim();

       }

       return productname;
   }
}
