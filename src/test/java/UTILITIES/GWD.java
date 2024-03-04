package UTILITIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

//singleton pattern
public class GWD { //general web driver
    private static WebDriver driver;


    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (driver == null) {
            driver = new ChromeDriver();  //polymorphsm-- top casting
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }

}
