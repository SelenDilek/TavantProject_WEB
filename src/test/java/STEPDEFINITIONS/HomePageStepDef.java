package STEPDEFINITIONS;

import PAGES.HomePage;
import UTILITIES.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;;

public class HomePageStepDef {
    HomePage homePage = new HomePage();


    @Given("Navigate to Tavant")
    public void navigateToTavant() {
        GWD.getDriver().get("https://tavant.com/");

    }

    @When("Click the Tavant button")
    public void clickTheTavantButton() {

        homePage.myClick(homePage.getTavantLink()); //polymorphism -- overriding (Methods class my click method )
    }


    @Then("Verify guests should be on home page successfully")
    public void verifyGuestsShouldBeOnHomePageSuccessfully() {
       String url= GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("tavant"));
    }
}
