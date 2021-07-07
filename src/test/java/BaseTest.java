import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    public void setUp() {
        String driverPath = "/home/ivan/Documents/geckodriver";
        System.setProperty("WebDriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void exitTest() {
        driver.quit();
    }
}
