package CodingInterview.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetCoordinateOfElement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        WebElement text = driver.findElement(By.xpath("//a[contains(@href, 'store.google.com')]"));
        System.out.println(text.getText());

        Point p = text.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());

        // Get the background color
        System.out.println(text.getCssValue("color"));

        driver.quit();
    }
}
