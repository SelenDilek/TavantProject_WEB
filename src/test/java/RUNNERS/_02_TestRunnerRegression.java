package RUNNERS;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(


        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
        //bu kisim jenkins icin eklendi
)

public class _02_TestRunnerRegression extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtendReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name")); //usurname : Selen Dilek
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Selen Dilek");
        ExtentService.getInstance().setSystemInfo("Application Name", "TAVANT"); //TAVANT
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA/SDET");
        ExtentService.getInstance().setSystemInfo("Version", "V2");
        ExtentService.getInstance().setSystemInfo("UI TESTING", "REGRESSION TEST");
        ExtentService.getInstance().setSystemInfo("WEB", "https://tavant.com/");
        ExtentService.getInstance().setSystemInfo("Environment", "QA ENVIRONMENT");
    }
}
