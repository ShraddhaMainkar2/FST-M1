package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Activity7 {

    @Test
    public void checkCourseSize() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms/");

        driver.findElement(By.linkText("All Courses")).click();

        List<WebElement> course = driver.findElements(By.xpath("//h3[@class='entry-title']"));
        System.out.println("Courses number :- " + ((List<?>) course).size());

        Iterator<WebElement> iterator = course.iterator();
        while (iterator.hasNext()) {
           String link = iterator.next().getText();
            System.out.println("Link on UI is : "+ link);

        }
        driver.close();
    }
}


