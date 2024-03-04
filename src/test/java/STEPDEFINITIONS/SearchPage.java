package STEPDEFINITIONS;

import PAGES.FollowUsPage;
import PAGES.HomePage;
import PAGES.SearchBarPage;
import UTILITIES.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    SearchBarPage searchBarPage = new SearchBarPage();
    FollowUsPage followUsPage = new FollowUsPage();
    HomePage homePage = new HomePage();
    List<WebElement> list = new ArrayList<>();
    Actions actions = new Actions(GWD.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();


    @And("User click to the search bar")
    public void userClickToTheSearchBar() {
        searchBarPage.myClick(searchBarPage.getSearch_Bar());

    }

    @Then("User sends to {string} text to the bar")
    public void userSendsToTextToTheBar(String str) throws InterruptedException {
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", searchBarPage.getSearch_Bar());
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", searchBarPage.getSearch_Input());
        searchBarPage.mySendKeys(searchBarPage.getSearch_Input(), str);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", searchBarPage.getSubmit_Button());



    }

    @When("User click submit button")
    public void userClickSubmitButton() {
        //searchBarPage.myClick(searchBarPage.getSubmit_Button());

    }

    @Then("User should verify that number of link is displayed below")
    public void userShouldVerifyThatNumberOfLinkIsDisplayedBelow() throws InterruptedException {

        list.add(searchBarPage.getLink_1());
        list.add(searchBarPage.getLink_2());
        list.add(searchBarPage.getLink_3());
        list.add(searchBarPage.getLink_4());
        list.add(searchBarPage.getLink_5());
        Assert.assertEquals(list.size(), 5);
        System.out.println("FINISH");

        followUsPage.myClick(followUsPage.getAccept_Button());

        for (WebElement e : list) {

            searchBarPage.myClick(e);
            actions.scrollToElement(searchBarPage.getLink_1()).build().perform();
            Thread.sleep(1000);
        }
    }

}
