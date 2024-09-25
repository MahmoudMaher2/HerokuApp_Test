package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage {

    // WebDriver
    WebDriver driver;

    // Constructor
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    // Action
    public void validateLoginSuccessfully()
    {
        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
        Assert.assertEquals(driver.findElement(By.className("subheader")).getText() , "Welcome to the Secure Area. When you are done click logout below.");
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).isDisplayed());
    }

}
