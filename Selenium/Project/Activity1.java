package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {

    @Test
    public void webSiteTitle() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        String title = driver.getTitle();
        String expectedTitle = "Alchemy LMS – An LMS Application";
        Assert.assertEquals(title, expectedTitle);
        driver.close();


    }
}