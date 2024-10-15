package CodingInterview.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickOnElementByJS {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        WebElement text = driver.findElement(By.xpath("//a[contains(@href, 'store.google.com')]"));
        System.out.println(text.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click()", text);
        Thread.sleep(3000);

    }
}
