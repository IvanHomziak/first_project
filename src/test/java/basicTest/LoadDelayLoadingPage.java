//package basicTest;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class LoadDelayLoadingPage extends driver{
//
//    @BeforeTest
//    public void setupProperties() {
//        String driverPath = "/home/ivan/Documents/geckodriver";
//        System.setProperty("WebDriver.gecko.driver", driverPath);
//
//    }
//
//    @AfterTest
//    public void testRunEnds() {
//        driver.quit();
//    }
//
//    @Test
//    public void LoadDelay() {
//        OpenLoadDelayPage();
//        LoungeToLoadDelayPage();
//        WaiterForExpectedCondifionOfLoading();
//    }
//
//    private void OpenLoadDelayPage() {
//        driver.get("http://www.uitestingplayground.com/");
//    }
//
//    private void WaiterForExpectedCondifionOfLoading() {
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Button Appearing After Delay')]")));
//    }
//
//    private void LoungeToLoadDelayPage() {
//        driver.findElement(By.xpath("//a[@href=\"/loaddelay\"]")).click();
//    }
//}
