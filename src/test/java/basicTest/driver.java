//package basicTest;
//
//
//import org.junit.After;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class driver {
//
//    static WebDriver driver = new FirefoxDriver();
//
//    @BeforeTest
//    private void setupProperties() {
//        String driverPath = "/home/ivan/Documents/geckodriver";
//        System.setProperty("WebDriver.gecko.driver", driverPath);
//        driver.get("http://www.uitestingplayground.com/");
//    }
//
//    @AfterTest
//    public void testRunEnds() {
//        driver.quit();
//    }
//
//}
