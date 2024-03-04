package RUNNERS;

import UTILITIES.GWDParallel;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _04_ParalelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserTipi")
    public void  beforeClass(String browserName){
        GWDParallel.threadBrowserName.set(browserName);
    }
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
