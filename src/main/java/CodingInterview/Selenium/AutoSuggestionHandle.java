package CodingInterview.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionHandle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        WebElement textbox = driver.findElement(By.className("gLFyf"));
        textbox.click();
        textbox.sendKeys("Amazon");

        List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@role='presentation']//ul/li"));

        for(WebElement element : autoSuggestion){

            System.out.println(element.getText());


        }



        driver.quit();
    }
}
