package STEPDEFINITIONS;

import PAGES.ScrollButtonPage;
import PAGES.SearchBarPage;
import UTILITIES.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollButtonStepDef {
    SearchBarPage searchBarPage = new SearchBarPage();
    ScrollButtonPage scrollButtonPage = new ScrollButtonPage();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    @And("User click scroll button")
    public void userClickScrollButton() throws InterruptedException {

        Thread.sleep(3000);
        scrollButtonPage.getScroll_Button().click();
        //scrollButtonPage.myClick(scrollButtonPage.getScroll_Button());
    }


    @Then("User should clean up the bar")
    public void userShouldCleanUpTheBar() throws InterruptedException {
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", searchBarPage.getSearch_Bar());
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", searchBarPage.getSearch_Input());
        searchBarPage.mySendKeys(searchBarPage.getSearch_Input(), "THANK YOU!");
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", searchBarPage.getSubmit_Button());
    }

    @Then("Verify that text  is displayed")
    public void verifyThatTextIsDisplayed() {

    }
}
