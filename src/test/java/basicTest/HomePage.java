package basicTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;


public class HomePage extends driver{

    public static void FindElementDynamicID() {

        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.cssSelector("#overview > div > div:nth-child(1) > div:nth-child(1) > h3 > a")).click();
        driver.findElement(By.xpath("/html/body/section/div/button")).click();
        driver.quit();
        System.out.println("Test succeed");

    }



    public static void ClassAttribute() {
        driver.get("http://www.uitestingplayground.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        String blueButton11 = driver.findElement(By.xpath("/html/body/section/div/button[1]")).getCssValue("backgroud-color");
        WebElement blueButton1 = driver.findElement(By.xpath("/html/body/section/div/button[1]"));

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String blueButton22 = driver.findElement(By.xpath("/html/body/section/div/button[2]")).getCssValue("backgroud-color");
        WebElement blueButton2 = driver.findElement(By.xpath("/html/body/section/div/button[2]"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        String blueButton33 = driver.findElement(By.xpath("/html/body/section/div/button[3]")).getCssValue("backgroud-color");
        WebElement blueButton3 = driver.findElement(By.xpath("/html/body/section/div/button[3]"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        if (blueButton11.contains("#007bff")) {
            blueButton1.click();
        }
        if (blueButton22.contains("#007bff")) {
            blueButton2.click();
        }
        if (blueButton33.contains("#007bff")) {
            blueButton3.click();
        }
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
        driver.get("http://www.uitestingplayground.com/");
        System.out.println("1");

        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/h3/a")).click();
        System.out.println("2");

        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
        System.out.println("3");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("4");

        driver.quit();
        System.out.println("Test passed");
    }


    public static void ClientSideDelay() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[2]/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/section/div/div/p"));
        driver.quit();
        System.out.println("Test passed");

    }

    public static void Click() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[3]/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"badButton\"]\n")).click();
        driver.findElement(By.xpath("//*[@id=\"badButton\"]")).getCssValue("#218838");
        driver.quit();
        System.out.println("Test passed");

    }

    public static void InputText() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[4]/h3/a")).click();
        WebElement myButton = driver.findElement(By.id("newButtonName"));
        myButton.sendKeys("New Button Name");
        driver.findElement(By.xpath("//*[@id=\"updatingButton\"]")).click();
        String buttonName = driver.findElement(By.xpath("//*[@id=\"updatingButton\"]")).getText();
        Assert.assertEquals("New Button Name" , buttonName);
        System.out.println("Test passed");
        driver.quit();

    }

    public static void ScrollBars() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[3]/div[1]/h3/a")).click();
        WebElement hidingButton = driver.findElement(By.xpath("//*[@id=\"hidingButton\"]"));
        JavascriptExecutor jS= (JavascriptExecutor) driver;
        jS.executeScript("arguments[0].scrollIntoView(true);", hidingButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hidingButton.click();
        System.out.println("Test passed");
        driver.quit();

    }

    public static void Visibility1() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[4]/div[1]/h3/a")).click();

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        for ( int i=0; i<buttons.size();i++)
        {
            WebElement button = buttons.get(i);

            System.out.println(button.getText());//It prints all the buttons name displayed on the page

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement hideButton = driver.findElement(By.xpath("//*[@id=\"hideButton\"]"));
        hideButton.click();
        List<WebElement> buttons1 = driver.findElements(By.tagName("button"));

        for ( int i=0; i<buttons1.size();i++)
        {
            WebElement button = buttons1.get(i);

            System.out.println(button.getText());//ця команда виведе всі доступні кнопки на сторінці

        }
        System.out.println("Displayed only Hide Button");
        driver.quit();


    }

    public static void DynamicTable() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[3]/div[2]/h3/a")).click();
        String chrom1 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[3]/span[1]")).getText();
        String chrom2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/span[3]")).getText();
        String chrom3 = ":";
        String chrom4 = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[3]/span[3]")).getText();
        System.out.println("chrom1"+"chrom2"+"chrom3"+"chrom4");

//        String chrom5 = driver.findElement(By.xpath("/html/body/section/div/p[2]")).getText();
//        WebElement chromeCPUValue = driver.findElement(By.tagName("div"));
//        WebElement chromeCPUValue2 = driver.findElement(By.xpath("/html/body/section/div/p[2]"));
//        if (chromeCPUValue == chromeCPUValue2, ) {
//            System.out.println("Test passed");
//
//        }
        System.out.println("Test passed");
        driver.quit();
    }


    public static void ProgressBar() {
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[3]/div[4]/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"startButton\"]")).click();
        WebElement stopButtonProgressBar = driver.findElement(By.xpath("//*[@id=\"stopButton\"]"));
        String progressBar1 = driver.findElement(By.xpath("/html/body/section/div/div[1]")).getCssValue("style");
//        if (progressBar1.contains("width: 75%")){
//            stopButtonProgressBar.click();
//        }
//        WebDriverWait waitForElement = new WebDriverWait(driver, 15));

//        waitForElement.until(ExpectedConditions.)
//                Until(ExpectedConditions.ElementIsVisible(By.CssSelector("div[class*='progress-bar-success']")));;






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