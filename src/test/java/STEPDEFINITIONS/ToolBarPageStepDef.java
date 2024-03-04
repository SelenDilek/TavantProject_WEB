package STEPDEFINITIONS;

import PAGES.ToolBarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import sun.security.util.PropertyExpander;

import java.util.ArrayList;
import java.util.List;

public class ToolBarPageStepDef {
    ToolBarPage toolBarPage = new ToolBarPage();

    @When("Mouseover the elements on toolbar")
    public void mouseoverTheElementsOnToolbar() {
        toolBarPage.mouseOver(toolBarPage.getIndustries_Button());
        toolBarPage.mouseOver(toolBarPage.getProducts_Button());
        toolBarPage.mouseOver(toolBarPage.getServices_Button());
        toolBarPage.mouseOver(toolBarPage.getAboutUs_Button());
        toolBarPage.mouseOver(toolBarPage.getCareers_Button());
        toolBarPage.mouseOver(toolBarPage.getImpact_Button());

    }

    @And("Wait for a while")
    public void waitForAWhile() {
        toolBarPage.wait.until(ExpectedConditions.visibilityOf(toolBarPage.getImpact_Button()));


    }

    @Then("Verify the home page toolbar displays successfully")
    public void verifyTheHomePageToolbarDisplaysSuccessfully() {
        List<WebElement> list = new ArrayList<>();
        list.add(toolBarPage.getIndustries_Button());
        list.add(toolBarPage.getProducts_Button());
        list.add(toolBarPage.getServices_Button());
        list.add(toolBarPage.getAboutUs_Button());
        list.add(toolBarPage.getCareers_Button());
        list.add(toolBarPage.getImpact_Button());

        Assert.assertEquals(list.size(),6);

        Assert.assertTrue(toolBarPage.getIndustries_Button().getText().contains("Industries"));
        Assert.assertTrue(toolBarPage.getServices_Button().getText().contains("Services"));
        Assert.assertTrue(toolBarPage.getProducts_Button().getText().contains("Products"));
        Assert.assertTrue(toolBarPage.getAboutUs_Button().getText().contains("About"));
        System.out.println(toolBarPage.getAboutUs_Button().getText());
        Assert.assertTrue(toolBarPage.getCareers_Button().getText().contains("Career"));
        Assert.assertTrue(toolBarPage.getImpact_Button().getText().contains("Impact"));



    }

    @Then("Verify the home page toolbar elements are clickable")
    public void verifyTheHomePageToolbarElementsAreClickable() {




    }

}
