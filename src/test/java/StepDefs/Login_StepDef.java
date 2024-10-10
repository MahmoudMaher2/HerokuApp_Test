package StepDefs;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDef {

    // 1. Pages
    LoginPage loginPage_Object;
    SecureAreaPage secureAreaPage_Object;

    // 2. Constructor of definition pages
    public Login_StepDef() {
        loginPage_Object = new LoginPage(Hooks.driver);
        secureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }

    // 3. Steps
    @Given("User navigate to login page")
    public void UserNavigateToLoginPage ()
    {
        loginPage_Object.NavigateToLoginPage();
    }

    @When("User login with credentials {string} {string}")
    public void userLoginWithCredentials(String username, String password) {
        loginPage_Object.EnterUsername(username);
        loginPage_Object.EnterPassword(password);
        loginPage_Object.ClickLoginBtutton();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        secureAreaPage_Object.validateLoginSuccessfully();
    }

    @Then("Error message Should be displayed")
    public void errorMessageShouldBeDisplayed() {
        loginPage_Object.ValidateErrorMessageApperance();
    }

    // Cancel Them
    @When("User enters Username {string}")
    public void userEntersUsername(String username) {
        loginPage_Object.EnterUsername(username);
    }

    @And("User enters Password {string}")
    public void userEntersPassword(String password) {
        loginPage_Object.EnterPassword(password);
    }

    @And("User clicks login Button")
    public void userClicksLoginButton() {
        loginPage_Object.ClickLoginBtutton();
    }

}
