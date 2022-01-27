import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium1 {

    WebDriver driver;

    @BeforeTest
    public void init(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");

    }

    @Test
    public void TC_01(){

//        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mgr327791");
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr382943");
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("UhuvAbA");
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();


    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
