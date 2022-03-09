package steps.serenity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PhonePage;

public class PhoneSerenity {

    WebDriver driver;
    PhonePage phonePage;
    private String name;
    private double price;
    private String detailName;
    private String description;

    public PhoneSerenity(String name, double price, String detailName, String description) {
        this.name = name;
        this.price = price;
        this.detailName = detailName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void open_Home_Page(){

        phonePage.open();
    }
    public void click_GalaxyName(){
        driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]\n")).click();
//        phonePage.click_GalaxyName();
    }
}
