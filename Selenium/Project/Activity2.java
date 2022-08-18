package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {


    @Test
    public void webSiteHeading() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms/");

        String actual = driver.findElement(By.xpath("//h1[contains(text(),'Experts')]")).getText();
        String expected = "Learn from Industry Experts";
        Assert.assertEquals(actual, expected);
        driver.close();

    }
}
