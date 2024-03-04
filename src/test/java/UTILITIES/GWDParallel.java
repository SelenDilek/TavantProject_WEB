package UTILITIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

//parallel testing
public class GWDParallel {

    private static ThreadLocal<WebDriver> threadDriver= new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName= new ThreadLocal<>();


    public static WebDriver getDriver() { //multi thread --

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if(threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if(threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;

                default:

                    if(isRunningOnJenkins()) {
                        FirefoxOptions options = new FirefoxOptions();
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                        threadDriver.set(new FirefoxDriver(options));
                    }
                    else
                    { threadDriver.set(new ChromeDriver());}

            }
        }
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            return threadDriver.get();
    }
    public static void quitDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            if (threadDriver.get()!=null) {
                threadDriver.get().quit();

                WebDriver driver =
                driver = null;

                threadDriver.set(driver);
        }
    }

    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }

}
