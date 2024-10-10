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
    public void navigateToLoginPage (){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    public void login (String username , String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
    }
//    public void enterUsername (String username){
//        driver.findElement(By.id("username")).sendKeys(username);
//    }
//    public void enterPassword (String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//    public void clickLoignButton (){
//        driver.findElement(By.className("radius")).click();
//    }
    public void VerifyInvalidUsername () {
        // Verify that the text in red part is "Your username is invalid!"
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));
    }
    public void VerifyInvalidPassword () {
        // Verify that the text in red part is "Your password is invalid!"
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your password is invalid!"));
    }


}
