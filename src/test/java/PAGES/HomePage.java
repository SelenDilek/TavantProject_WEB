package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Methods { //Inheritance OOP
    public HomePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='elementor-widget-container']//a)[1]")
    private WebElement tavantLink; //encapsulation OOP

    public WebElement getTavantLink() {
        return tavantLink;
    }

    public void setTavantLink(WebElement tavantLink) {
        this.tavantLink = tavantLink;
    }
}