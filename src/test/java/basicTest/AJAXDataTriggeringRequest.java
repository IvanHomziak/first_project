//package basicTest;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class AJAXDataTriggeringRequest extends driver {
//
//
//
//
//    @Test
//    public void AJAXData() {
//        driver.get("http://www.uitestingplayground.com/");
//        System.out.println("1");
//
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/h3/a")).click();
//        System.out.println("2");
//
//        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
//        System.out.println("3");
//
//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("4");
//
//        driver.quit();
//        System.out.println("Test passed");
//    }
//}
