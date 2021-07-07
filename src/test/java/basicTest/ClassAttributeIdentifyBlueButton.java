//package basicTest;
//
//        import org.openqa.selenium.Alert;
//        import org.openqa.selenium.By;
//        import org.testng.Assert;
//        import org.testng.annotations.AfterTest;
//        import org.testng.annotations.BeforeTest;
//        import org.testng.annotations.Test;
//
//public class ClassAttributeIdentifyBlueButton extends driver {
//
//
//    @BeforeTest
//    public void setupProperties() {
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
//
//    @Test
//    public void ClassAttribute() {
//        LoungeToClassAttributePage();
//        FindBlueButtonUsingClassAttribute();
//        CompareAllertREsoults();
//    }
//
//
//    private void FindBlueButtonUsingClassAttribute() {
//        driver.findElement(By.xpath("//button[contains(@class, ' btn-primary ')]")).click();
//    }
//
//    private void LoungeToClassAttributePage() {
//        driver.findElement(By.xpath("//a[contains(text(), \"Class Attribute\")]")).click();
//    }
//
//    private void CompareAllertREsoults() {
//        String allertTextMessege = driver.switchTo().alert().getText();
//        Assert.assertEquals(allertTextMessege, "Primary button pressed");
//    }
//}