package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.AdminPage;
import pages.LoginPage;

public class MyStepdefs implements En {
    WebDriver driver;
    LoginPage login;
    AdminPage admin;

    @Given("I'm on login page")
    public void iMOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
    }

    @When("I login to system")
    public void iLoginToSystem() {
        login = new LoginPage(driver);
        login.Login();
    }

    @Then("System displays welcome message")
    public void systemDisplaysWelcomeMessage() {
        admin = new AdminPage(driver);
        Assert.assertEquals(admin.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
    }
}
