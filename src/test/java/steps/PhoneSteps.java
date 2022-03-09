package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.testng.Assert;
import steps.serenity.PhoneSerenity;

public class PhoneSteps {

    @Steps
    PhoneSerenity  phoneSerenity;

    @Given("^Open home page$")
    public void openHomePage(){
        phoneSerenity.open_Home_Page();
    }


    @Then("The website display Galaxy in phone category correct with \"([^\"*)\" and \"([^\"*)\"")
    public void theWebsiteDisplayGalaxyInPhoneCategoryCorrectWithAnd(String name, String price) {
        Assert.assertEquals(phoneSerenity.getName(),name);
        Assert.assertEquals(phoneSerenity.getPrice(),price);
    }

    @When("Click on galaxy name")
    public void clickOnGalaxyName() {
        phoneSerenity.click_GalaxyName();
    }

    @Then("The website navigate to galaxy detail page correct with \"([^\"*)\" and \"([^\"*)\"")
    public void theWebsiteNavigateToGalaxyDetailPageCorrectWithAnd(String detailName, String description) {
        Assert.assertEquals(phoneSerenity.getDetailName(),detailName);
        Assert.assertEquals(phoneSerenity.getDescription(),description);
    }
}
