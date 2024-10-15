package ShubhamCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class GenericUtil {

    public WebDriver driver;

    public GenericUtil(WebDriver driver){
        this.driver = driver;
    }


    public void switchPageToChildWindow(){
        Set<String> s1 = driver.getWindowHandles();

        Iterator<String> it = s1.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
    }

    public void switchPageToParentWindow(){
        Set<String> s1 = driver.getWindowHandles();

        Iterator<String> it = s1.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(parentWindow);
    }

    public void waitForWebElementToAppear(WebElement findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void waitForElementToAppear(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void mouseHover(By findBy){
        WebElement element = driver.findElement(findBy);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        action.click().build().perform();
    }
}
