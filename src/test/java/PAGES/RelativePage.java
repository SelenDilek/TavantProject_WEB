package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelativePage extends Methods {

    public RelativePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span//strong")
    private WebElement industries_Text; //encapsulation OOP

    @FindBy(xpath = "(//span//strong)[1]")
    private WebElement products_text;

    @FindBy(xpath = "(//span//strong)[1]")
    private WebElement services_Text;

    @FindBy(xpath = "(//span//strong)[1]")
    private WebElement about_US;

    @FindBy(xpath = "(//span//strong)[1]")
    private WebElement careers_Text;

    @FindBy(xpath = "(//span//strong)[1]")
    private WebElement impact_Text;

    public WebElement getIndustries_Text() {
        return industries_Text;
    }

    public void setIndustries_Text(WebElement industries_Text) {
        this.industries_Text = industries_Text;
    }

    public WebElement getProducts_text() {
        return products_text;
    }

    public void setProducts_text(WebElement products_text) {
        this.products_text = products_text;
    }

    public WebElement getServices_Text() {
        return services_Text;
    }

    public void setServices_Text(WebElement services_Text) {
        this.services_Text = services_Text;
    }

    public WebElement getAbout_US() {
        return about_US;
    }

    public void setAbout_US(WebElement about_US) {
        this.about_US = about_US;
    }

    public WebElement getCareers_Text() {
        return careers_Text;
    }

    public void setCareers_Text(WebElement careers_Text) {
        this.careers_Text = careers_Text;
    }

    public WebElement getImpact_Text() {
        return impact_Text;
    }

    public void setImpact_Text(WebElement impact_Text) {
        this.impact_Text = impact_Text;
    }
}
