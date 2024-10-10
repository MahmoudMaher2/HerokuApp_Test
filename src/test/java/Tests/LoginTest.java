package Tests;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage_object;
    SecureAreaPage secureAreaPage_object;

    @BeforeClass
    public void preconditions (){
        loginPage_object = new LoginPage(driver);
        secureAreaPage_object = new SecureAreaPage(driver);
    }

    @Test (priority = 1)
    public void LoginWithValidCredential (){
        loginPage_object.navigateToLoginPage();
        loginPage_object.login("tomsmith","SuperSecretPassword!");
//        loginPage_object.enterUsername("tomsmith");
//        loginPage_object.enterPassword("SuperSecretPassword!");
//        loginPage_object.clickLoignButton();
        secureAreaPage_object.validateLoginSuccessfully();
    }

    @Test (priority = 2)
    public void LoginWithInvalidUsername (){
        loginPage_object.navigateToLoginPage();
        loginPage_object.login("invalid","SuperSecretPassword!");
//        loginPage_object.enterUsername("invalid");
//        loginPage_object.enterPassword("SuperSecretPassword!");
//        loginPage_object.clickLoignButton();
        loginPage_object.VerifyInvalidUsername();
    }

    @Test (priority = 3)
    public void LoginWithInvalidPassword (){
        loginPage_object.navigateToLoginPage();
        loginPage_object.login("tomsmith","invalid");
//        loginPage_object.enterUsername("tomsmith");
//        loginPage_object.enterPassword("invalid");
//        loginPage_object.clickLoignButton();
        loginPage_object.VerifyInvalidPassword();
    }

}
