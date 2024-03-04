package PAGES;

import UTILITIES.GWD;
import UTILITIES.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowUsPage extends Methods { //inheritance OOPs
    public FollowUsPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//h3[text()='Follow us']")
    private WebElement followUs_Text; //encapsulation OOPs with getter-setter

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/button")
    private WebElement accept_Button;

    @FindBy(xpath = "//*[@id=\"footer-social-links\"]/div/div/span[1]/a")
    private WebElement facebook;


    @FindBy(xpath = "//*[@id=\"footer-social-links\"]/div/div/span[2]/a")
    private WebElement youtube;


    @FindBy(xpath = "//*[@id=\"footer-social-links\"]/div/div/span[3]/a")
    private WebElement twitter;

    @FindBy(xpath = "//*[@id=\"footer-social-links\"]/div/div/span[4]/a")
    private WebElement linkedin;

    @FindBy(xpath = "//*[@id=\"footer-social-links\"]/div/div/span[5]/a")
    private WebElement instagram;

    public void setAccept_Button(WebElement accept_Button) {
        this.accept_Button = accept_Button;
    }

    public WebElement getFacebook() {
        return facebook;
    }

    public void setFacebook(WebElement facebook) {
        this.facebook = facebook;
    }

    public WebElement getYoutube() {
        return youtube;
    }

    public void setYoutube(WebElement youtube) {
        this.youtube = youtube;
    }

    public WebElement getTwitter() {
        return twitter;
    }

    public void setTwitter(WebElement twitter) {
        this.twitter = twitter;
    }

    public WebElement getAccept_Button() {
        return accept_Button;
    }

    public WebElement getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(WebElement linkedin) {
        this.linkedin = linkedin;
    }

    public WebElement getInstagram() {
        return instagram;
    }

    public void setInstagram(WebElement instagram) {
        this.instagram = instagram;
    }

    public WebElement getFollowUs_Text() {
        return followUs_Text;
    }

    public void setFollowUs_Text(WebElement followUs_Text) {
        this.followUs_Text = followUs_Text;
    }
}
