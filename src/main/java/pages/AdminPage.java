package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage(){
         return driver.findElement(By.xpath("*//marquee")).getText();
    }
}
