package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage extends Methods {
    public SearchBarPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='ekit_navsearch-button ekit-modal-popup'])[1]")
    private WebElement search_Bar; //encapsulation OOP

    @FindBy(xpath = "(//input[@type='search'])[1]")
    private WebElement search_Input; //encapsulation OOP

    @FindBy(xpath = "//*[@id=\"ekit_modal-popup-dbb9e04\"]/div/form/button")
    private WebElement submit_Button; //encapsulation OOP

    @FindBy(xpath = "/html/body/div[5]/div/section/div/div/div/div[2]/div/nav/a[1]")
    private WebElement link_1; //encapsulation OOP

    @FindBy(xpath = "/html/body/div[5]/div/section/div/div/div/div[2]/div/nav/a[2]")
    private WebElement link_2; //encapsulation OOP


    @FindBy(xpath = "/html/body/div[5]/div/section/div/div/div/div[2]/div/nav/a[3]")
    private WebElement link_3; //encapsulation OOP

    @FindBy(xpath = "/html/body/div[5]/div/section/div/div/div/div[2]/div/nav/a[4]")
    private WebElement link_4; //encapsulation OOP

    @FindBy(xpath = "/html/body/div[5]/div/section/div/div/div/div[2]/div/nav/a[4]")
    private WebElement link_5; //encapsulation OOP

    public WebElement getSearch_Bar() {
        return search_Bar;
    }

    public void setSearch_Bar(WebElement search_Bar) {
        this.search_Bar = search_Bar;
    }

    public WebElement getSearch_Input() {
        return search_Input;
    }

    public void setSearch_Input(WebElement search_Input) {
        this.search_Input = search_Input;
    }

    public WebElement getSubmit_Button() {
        return submit_Button;
    }

    public void setSubmit_Button(WebElement submit_Button) {
        this.submit_Button = submit_Button;
    }

    public WebElement getLink_1() {
        return link_1;
    }

    public void setLink_1(WebElement link_1) {
        this.link_1 = link_1;
    }

    public WebElement getLink_2() {
        return link_2;
    }

    public void setLink_2(WebElement link_2) {
        this.link_2 = link_2;
    }

    public WebElement getLink_3() {
        return link_3;
    }

    public void setLink_3(WebElement link_3) {
        this.link_3 = link_3;
    }

    public WebElement getLink_4() {
        return link_4;
    }

    public void setLink_4(WebElement link_4) {
        this.link_4 = link_4;
    }

    public WebElement getLink_5() {
        return link_5;
    }

    public void setLink_5(WebElement link_5) {
        this.link_5 = link_5;
    }
}
