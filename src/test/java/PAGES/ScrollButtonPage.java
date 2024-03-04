package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollButtonPage extends Methods {
    public ScrollButtonPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div//a[contains(@href,'changeme')]")
    private WebElement scroll_Button;

    public WebElement getScroll_Button() {
        return scroll_Button;
    }

    public void setScroll_Button(WebElement scroll_Button) {
        this.scroll_Button = scroll_Button;
    }
}
