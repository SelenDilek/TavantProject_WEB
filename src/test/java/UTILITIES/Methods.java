package UTILITIES;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Methods {
    Actions actions = new Actions(GWD.getDriver());
   public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void mySendKeys(WebElement element , String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public  void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);

    }
    public  void verifyContainsText(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void mouseOver(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).build().perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
