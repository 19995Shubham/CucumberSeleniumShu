package CodingInterview.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetTextOfLink {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");


        WebElement text = driver.findElement(By.xpath("//a[contains(@href, 'store.google.com')]"));
        System.out.println(text.getText());
        System.out.println(text.getAttribute("class"));

        driver.quit();
    }
}
