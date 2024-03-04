package STEPDEFINITIONS;

import PAGES.FollowUsPage;
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
import java.util.Set;

public class FollowUsStepDef {
    FollowUsPage followUsPage = new FollowUsPage(); //object-class part of the OOPs
    List<WebElement> list = new ArrayList<>();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    Actions actions = new Actions(GWD.getDriver());

    @And("User goes to the bottom of the page")
    public void userGoesToTheBottomOfThePage() {
        actions.scrollToElement(followUsPage.getFollowUs_Text()).build().perform();
        Assert.assertEquals(followUsPage.getFollowUs_Text().getText(), "Follow us");
        //followUsPage.myClick(followUsPage.getAccept_Button());

    }

    @Then("Verify number of link")
    public void verifyNumberOfLink() {

        list.add(followUsPage.getFacebook());
        list.add(followUsPage.getYoutube());
        list.add(followUsPage.getTwitter());
        list.add(followUsPage.getLinkedin());
        list.add(followUsPage.getInstagram());

        Assert.assertEquals(list.size(), 5);


    }

    @When("User click the following links are displayed")
    public void userClickTheFollowingLinksAreDisplayed() throws InterruptedException {

        String homePage = GWD.getDriver().getWindowHandle();
        for (WebElement e : list) {
            js.executeScript("arguments[0].click();", e);
            Thread.sleep(1000);

        }

        Set<String> set = GWD.getDriver().getWindowHandles();
        for (String s : set) {
            if (s.equals(homePage)) {
                GWD.getDriver().switchTo().window(s);
                Thread.sleep(1000);
                System.out.println("Title =" + GWD.getDriver().getTitle() + "URL =" + GWD.getDriver().getCurrentUrl());
            }
        }
        for (String s : set) {
            if(s.equals(homePage))  continue; //ana sayfanin id si gelirse pas gec alti calistirma donguye devam et.
            GWD.getDriver().switchTo().window(s);
            Thread.sleep(1000);
            GWD.getDriver().close();
        }



    }


    @Then("User should verify that social media page is displayed")
    public void userShouldVerifyThatSocialMediaPageIsDisplayed() {

    }


}
