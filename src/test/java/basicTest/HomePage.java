package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.image.ByteLookupTable;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui;


public class HomePage extends driver{ /* створюємо клас хоум пейдж. для того щоб взаємодіяти з цим класом
в селеніум веб драйвері на потрібні два класи: Ву і Веб-Драйвер.
Будь який клас це шавлон по якому створюється об*єкт.*/



    //By homeTabTitle = By.id("title");
    // By buttonId = By.id("id=cfae2613-fac9-f277-a48a-14036b611b01")


    public static void FindElementDynamicID() {
        /* driver.get("http://www.uitestingplayground.com/home");*//*
        driver.findElement(By.name("Button with Dynamic ID")).click();*/
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.cssSelector("#overview > div > div:nth-child(1) > div:nth-child(1) > h3 > a")).click();
        driver.findElement(By.xpath("/html/body/section/div/button")).click();
        driver.quit();
    }



    public static void ClassAttribute() {
        driver.get("http://www.uitestingplayground.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
//        System.out.println("1");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        // String buttonCollor =
        // WebElement blueButton = driver.findElement(By.tagName("button"));
        String blueButton11 = driver.findElement(By.xpath("/html/body/section/div/button[1]")).getCssValue("backgroud-color");
        WebElement blueButton1 = driver.findElement(By.xpath("/html/body/section/div/button[1]"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        System.out.println("1");
        String blueButton22 = driver.findElement(By.xpath("/html/body/section/div/button[2]")).getCssValue("backgroud-color");
        WebElement blueButton2 = driver.findElement(By.xpath("/html/body/section/div/button[2]"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String blueButton33 = driver.findElement(By.xpath("/html/body/section/div/button[3]")).getCssValue("backgroud-color");
        WebElement blueButton3 = driver.findElement(By.xpath("/html/body/section/div/button[3]"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if (blueButton11.contains("#007bff")) {
            blueButton1.click();
        }
//        System.out.println("1");
        if (blueButton22.contains("#007bff")) {
            blueButton2.click();
        }
//        System.out.println("2");
        if (blueButton33.contains("#007bff")) {
            blueButton3.click();
        }
//        System.out.println("3");
//
//        WebElement FindButtonClass = driver.findElement(By.);
//        FindButtonClass.click();
        driver.quit();
        System.out.println("Test succeed");
    }



        public static void HiddenLayers1() {
            driver.get("http://www.uitestingplayground.com/hiddenlayers");
            Actions action = new Actions(driver);
            action.doubleClick();
            driver.quit();
            System.out.println("Test passed");
        }



        public static void LoadDelay() {
            driver.get("http://www.uitestingplayground.com/");
            driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[1]/div[4]/h3/a")).click();
            WebDriverWait wait = new WebDriverWait(driver, 15);
            driver.quit();
            System.out.println("Test passed");
        }


    public static void AJAXData() {
//        driver.get("http://www.uitestingplayground.com/ajax");
//        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        WebElement element = driver.findElement(By.tagName("p"));
//        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.uitestingplayground.com/ajax");
//        driver.findElement(By.name("Data loaded with AJAX get request."));
//        driver.findElement(By.xpath("/html/body/section/div/button")).click();
        WebElement pressButton = driver.findElement(By.xpath("/html/body/section/div/button"));
        pressButton.click();
        System.out.println("Test stage");

//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //        WebElement waitResult = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement waitUntil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/p")));
        driver.quit();
        System.out.println("Test passed");
    }












    public static void CheckPicture() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"description\"]/div/div/div[2]/img"));
        driver.quit();
    }

    public static void CheckTekstHomePage() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.cssSelector("#overview > div > div:nth-child(1) > div:nth-child(3) > p"));

    }

    public static void ApacheLicense() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.cssSelector("#license > a"));
    }
//    public static void ClassAttribute(){
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
//        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
//
//    }

//    public static void HiddenLayers1() {
//    }
/*    public String  getTitleText () {

        return driver.findElement(By.id("homeTabTitle")).getText();
    }*/

/*    public void ClickOnButton() {
        driver.findElement(By.id("buttonId")).click();

    }*/

/*    public HomePage(WebDriver driver) { //це конструктор який приймає драйвер.
        this.driver = driver; // створюємо обєкт драйвер*/


}