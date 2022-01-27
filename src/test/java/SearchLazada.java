import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchLazada {

    WebDriver driver;

    @BeforeTest
    public void setUp(){

//        System.setProperty("webdriver.chrome.driver","chromedrive");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.get("https://www.lazada.vn/");
        driver.navigate().to("https://www.lazada.vn/");

    }

    @Test
    public void searchMacBookPro2021(){

//        WebElement search = driver.findElement(By.id("q"));
//        search.sendKeys("macbook pro 2021");

        //Or
        driver.findElement(By.id("q")).sendKeys("macbook pro 2021");

        driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();

        WebElement result=  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]"));
//        Assert.assertEquals("MacBook Pro 2021 16 inches, M1 Pro/M1 Max- Hàng Chính Hãng",result.getText());

    }

//    @Test
//    public void buyProduct(){
//
//        List<WebElement> search = driver.findElements(By.tagName("img"));
//        WebElement image = search.get(3);
//        image.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @AfterTest
    public void tearDown(){

        driver.close();
        driver.quit();
    }
}
