//
//package basicTest;
//
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.testng.annotations.AfterTest;
//        import org.testng.annotations.BeforeTest;
//        import org.testng.annotations.Test;
//
//public class FindButtonNotUseId extends DriverForHomePageObjects{
//
//
//    @BeforeTest
//    public void setupProperties() {
//        String driverPath = "/home/ivan/Documents/geckodriver";
//        System.setProperty("WebDriver.gecko.driver", driverPath);
//        driver.get("http://www.uitestingplayground.com/");
//
//    }
//
//    @AfterTest
//    public void testRunEnds(){
//
//        driver.quit();
//    }
//
//
//
//    @Test
//    public void FindElementDynamicID() {
//
//        LoungeToDynamicIdPage();
//        FindAndClickOnButtonWithDynamicId();
//    }
//
//    private void FindAndClickOnButtonWithDynamicId() {
//        driver.findElement(By.xpath("//button[contains(text(), 'Button with Dynamic ID')]")).click();
//    }
//
//    private void LoungeToDynamicIdPage() {
//        driver.findElement(By.xpath("//a[contains(text(), \"Dynamic ID\")]")).click();
//    }
//
//}
