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
    public void validateLoginSuccessfully (){
        // Verify that URL is in secure area page
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
        // Verify Green part is displayed
        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
        // Verify that the text in green part is "You logged into a secure area!"
        Assert.assertTrue(driver.findElement(By.id("flash-messages")).getText().contains("You logged into a secure area!"));
        // Verify that "Welcome to the Secure Area" is displayed
        Assert.assertTrue(driver.findElement(By.className("subheader")).getText().equals("Welcome to the Secure Area. When you are done click logout below."));
    }

    }
