package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 {

    @Test
    public void clickOnSecondPopularCourse() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms/");
        String actual = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]")).getText();
        String expected = "Email Marketing Strategies";
        Assert.assertEquals(actual, expected);
        driver.close();
    }
}
