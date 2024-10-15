package CodingInterview.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClearTextInTextBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        WebElement searchtext = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchtext.sendKeys("Amazon");
        Thread.sleep(2000);
        searchtext.clear();
        Thread.sleep(3000);


        ///////////Without using clear method delete
        searchtext.sendKeys("Amazon");
        //control + a then delete
        searchtext.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        searchtext.sendKeys(Keys.DELETE);
        Thread.sleep(3000);


        driver.quit();

    }
}
