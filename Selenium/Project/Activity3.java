package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 {


    @Test
    public void firstInfoBox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms/");

        String actual = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]")).getText();
        String expected = "Actionable Training";
        Assert.assertEquals(actual,expected);
        driver.close();

    }
}