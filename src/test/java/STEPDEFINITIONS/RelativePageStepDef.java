package STEPDEFINITIONS;

import PAGES.HomePage;
import PAGES.RelativePage;
import PAGES.ToolBarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RelativePageStepDef {

    RelativePage relativePage = new RelativePage();
    ToolBarPage toolBarPage = new ToolBarPage();
    HomePage homePage = new HomePage();

    @When("Click the relevant page")
    public void clickTheRelevantPage() throws InterruptedException {
        //toolBarPage.mouseOver(toolBarPage.getIndustries_Button());
        toolBarPage.myClick(toolBarPage.getIndustries_Button());
        Assert.assertEquals(relativePage.getIndustries_Text().getText(),"Industries");

        //toolBarPage.mouseOver(toolBarPage.getProducts_Button());
        toolBarPage.myClick(toolBarPage.getProducts_Button());
        Assert.assertEquals(relativePage.getProducts_text().getText(),"Products");

        //toolBarPage.mouseOver(toolBarPage.getServices_Button());
        toolBarPage.myClick(toolBarPage.getServices_Button());
        Thread.sleep(1000);
        Assert.assertEquals(relativePage.getServices_Text().getText(),"Services");

        //toolBarPage.mouseOver(toolBarPage.getCareers_Button());
        toolBarPage.myClick(toolBarPage.getCareers_Button());
        Thread.sleep(1000);
        Assert.assertEquals(relativePage.getCareers_Text().getText(),"Careers");

        //toolBarPage.mouseOver(toolBarPage.getImpact_Button());
        toolBarPage.myClick(toolBarPage.getImpact_Button());
        Thread.sleep(1000);
        Assert.assertEquals(relativePage.getImpact_Text().getText(),"Impact");


    }

    @Then("Verify the title on the relative page")
    public void verifyTheTitleOnTheRelativePage() {

        toolBarPage.mouseOver(toolBarPage.getAboutUs_Button());
        toolBarPage.myClick(toolBarPage.getAboutUs_Button());
        System.out.println("ABOUT US BUTTON NOT CLICKABLE");
        Assert.assertEquals(toolBarPage.getAboutUs_Button().getText(),"About Us");
        homePage.myClick(homePage.getTavantLink());


    }
}
