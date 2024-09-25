package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    // WebDriver
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Action
    public void  NavigateToLoginPage () {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    public void EnterUsername (String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }
    public void EnterPassword (String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }
    public void ClickLoginBtutton (){
        driver.findElement(By.className("radius")).click();
    }
    public void ValidateErrorMessageApperance (){
        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
    }
}
