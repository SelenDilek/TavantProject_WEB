package STEPDEFINITIONS;

import UTILITIES.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {
        System.out.println("Testing is ready");
    }
    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] inMemory = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(inMemory, "image/png", "screenshot name");
            GWD.quitDriver();
        }


    }

}
