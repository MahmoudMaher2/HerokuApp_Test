package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    // 1. WebDriver
    public static WebDriver driver;

    // 2. Before --> Open Browser
    @Before
    public void OpenBrowser (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // 3. After  --> Close Browser
    @After
    public void CloseBrowser (){
        driver.quit();
    }
}
