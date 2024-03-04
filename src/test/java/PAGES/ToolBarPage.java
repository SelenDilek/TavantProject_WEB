package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolBarPage extends Methods {
    public ToolBarPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//li//a//span[text()='Industries']")
    private WebElement industries_Button; //encapsulation OOP

    @FindBy(xpath = "//li//a//span[text()='Products']")
    private WebElement products_Button; //encapsulation OOP

    @FindBy(xpath = "//li//a//span[text()='Services']")
    private WebElement services_Button; //encapsulation OOP

    @FindBy(xpath = "//li//a//span[text()='About Us']")
    private WebElement aboutUs_Button; //encapsulation OOP

    @FindBy(xpath = "//li//a//span[text()='Careers']")
    private WebElement careers_Button; //encapsulation OOP

    @FindBy(xpath = "//li//a//span[text()='Impact']")
    private WebElement impact_Button; //encapsulation OOP

    public WebElement getIndustries_Button() {
        return industries_Button;
    }

    public void setIndustries_Button(WebElement industries_Button) { //setter
        this.industries_Button = industries_Button;
    }

    public WebElement getProducts_Button() {  //getter
        return products_Button;
    }

    public void setProducts_Button(WebElement products_Button) {
        this.products_Button = products_Button;
    }

    public WebElement getServices_Button() {
        return services_Button;
    }

    public void setServices_Button(WebElement services_Button) {
        this.services_Button = services_Button;
    }

    public WebElement getAboutUs_Button() {
        return aboutUs_Button;
    }

    public void setAboutUs_Button(WebElement aboutUs_Button) {
        this.aboutUs_Button = aboutUs_Button;
    }

    public WebElement getCareers_Button() {
        return careers_Button;
    }

    public void setCareers_Button(WebElement careers_Button) {
        this.careers_Button = careers_Button;
    }

    public WebElement getImpact_Button() {
        return impact_Button;
    }

    public void setImpact_Button(WebElement impact_Button) {
        this.impact_Button = impact_Button;
    }
}
