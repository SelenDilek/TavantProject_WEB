package RUNNERS;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = "@Regression and @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)

public class _03_TestRunnerExtendReport extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtendReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name")); //usurname : Selen Dilek
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Selen Dilek");
        ExtentService.getInstance().setSystemInfo("Application Name", "TAVANT");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");

    }


}
