import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;

public class Selenium1 {

    WebDriver driver;
    LoginPage login;
    AdminPage admin;

    @BeforeTest
    public void init(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");

    }

    @Test
    public void TC_01(){

        login = new LoginPage(driver);
        admin = new AdminPage(driver);
        login.Login();

//        driver.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")).sendKeys("Welcome To Manager's Page of Guru99 Bank");
        //OR
        Assert.assertEquals(admin.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");


    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
