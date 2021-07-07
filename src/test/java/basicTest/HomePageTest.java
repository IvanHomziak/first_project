//package basicTest;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//
//public class HomePageTest extends driver {
//
//    String driverPath = "/home/ivan/Documents/geckodriver";
///*    WebDriver driver;
//    HomePage homePage;*/
//
//
//    @BeforeTest //this is a pre-conditions
//    public void setup() {
//        System.setProperty("WebDriver.gecko.driver", driverPath);
//        /*driver.get("http://www.uitestingplayground.com/");*/
//
//    }
//
//    @AfterTest //post-conditions
//    public void endTest() {
//        driver.quit();
//        System.out.println("Tests have passed");
//    }
//
//    @Test
//    public void FindElementDynamicID() {
//        HomePage.FindElementDynamicID();
//    }
//
//    @Test
//    public void ClassAttribute() {
//        HomePage.ClassAttribute();
//    }
//
//    @Test
//    public void HiddenLayers() {
//        HomePage.HiddenLayers();
//    }
//
//    @Test
//    public void LoadDelay() {
//        HomePage.LoadDelay();
//    }
//
//    @Test
//    public void AJAXData() {
//        HomePage.AJAXData();
//    }
//
//    @Test
//    public void ClientSideDelay() {
//        HomePage.ClientSideDelay();
//    }
//
//    @Test
//    public void Click() {
//        HomePage.Click();
//    }
//
//    @Test
//    public void InputText() {
//        HomePage.InputText();
//    }
//
//    @Test
//    public void ScrollBars() {
//        HomePage.ScrollBars();
//    }
//
//    @Test
//    public void DynamicTable2() {
//        HomePage.DynamicTable2();
//    }
//
//    @Test
//    public void VerifyText() {
//        HomePage.VerifyText();
//    }
//    @Test
//    public void ProgressBar() {
//        HomePage.ProgressBar();
//    }
//
//    @Test
//    public void Visibility1() {
//        HomePage.Visibility1();
//    }
//
//    @Test
//    public void SampleApp() {
//        HomePage.SampleApp();
//    }
//
//    @Test
//    public void MouseOver() {
//        HomePage.MouseOver();
//    }
//
//    @Test
//    public void SpaceBreak() {
//        HomePage.SpaceBreak();
//    }
//
////    @Test
////    public void FindButtonByDynamicId(){
////        FindButtonByDynamicId.
////    }
//
//
//}