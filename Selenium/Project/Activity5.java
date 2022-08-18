package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity5 {

    @Test
    public void clickOnMyAccount() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms/");

        driver.findElement(By.linkText("My Account")).click();
        String actual = driver.getTitle();
        System.out.println("Actual title : " + actual);
        String expected = "My Account – Alchemy LMS";
        Assert.assertEquals(actual, expected);
        driver.close();
    }
}


