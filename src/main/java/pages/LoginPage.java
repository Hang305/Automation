package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Login(){
        //        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mgr327791");
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr382943");
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("UhuvAbA");
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
    }
}
