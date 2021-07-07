//package basicTest;
//
//import org.junit.Assert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.JavascriptExecutor;
//
//
//public class HomePage extends driver{
//
//    public static void FindElementDynamicID() {
//
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[contains(text(), \"Dynamic ID\")]")).click();
//        driver.findElement(By.xpath("/html/body/section/div/button")).click();
//        System.out.println("Test succeed");
//
//    }
//
//
//
//    public static void ClassAttribute() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[contains(text(), \"Class Attribute\")]")).click();
//        driver.findElement(By.xpath("//button[contains(@class, ' btn-primary ')]")).click();
//        Alert alertOK = driver.switchTo().alert();
//        alertOK.accept();
//
//    }
//
//
//
//    //need to be complete!!!!!!!!!!!!!!!!!!!
//    public static void HiddenLayers() {
//        driver.get("http://www.uitestingplayground.com/hiddenlayers");
//        WebElement greenButton1 = driver.findElement(By.id("greenButton"));
//        WebElement blueButton1 = driver.findElement(By.id("blueButton"));
//        blueButton1.click();
////        String greenButtoncollorValue = driver.findElement(By.)
//        if (greenButton1.isSelected()) {
//            System.out.println("Test Fail");
//        }
//        else {
//            System.out.println("Test passed");
//
//        }
//        System.out.println("Test passed");
//    }
//
//
//
//    public static void LoadDelay() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[1]/div[4]/h3/a")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Button Appearing After Delay')]")));
//        System.out.println("Test passed");
//    }
//
//
//    public static void AJAXData() {
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
//
//
//    public static void ClientSideDelay() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[2]/h3/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"ajaxButton\"]")).click();
//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(By.xpath("//p[contains(text(), 'Data calculated on the client side.')]"));
//        driver.quit();
//        System.out.println("Test passed");
//
//    }
//
//    public static void Click() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[contains(text(), 'Click')]")).click();
//        driver.findElement(By.xpath("//*[@id=\"badButton\"]\n")).click();
//        driver.findElement(By.xpath("//*[@id=\"badButton\"]")).getCssValue("#218838");
//        driver.quit();
//        System.out.println("Test passed");
//
//    }
//
//    public static void InputText() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[4]/h3/a")).click();
//        WebElement myButton = driver.findElement(By.id("newButtonName"));
//        myButton.sendKeys("New Button Name");
//        driver.findElement(By.xpath("//*[@id=\"updatingButton\"]")).click();
//        String buttonName = driver.findElement(By.xpath("//*[@id=\"updatingButton\"]")).getText();
//        Assert.assertEquals("New Button Name" , buttonName);
//        System.out.println("Test passed");
//        driver.quit();
//
//    }
//
//    public static void ScrollBars() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[3]/div[1]/h3/a")).click();
//        WebElement hidingButton = driver.findElement(By.xpath("//*[@id=\"hidingButton\"]"));
//        JavascriptExecutor jS= (JavascriptExecutor) driver;
//        jS.executeScript("arguments[0].scrollIntoView(true);", hidingButton);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        hidingButton.click();
//        System.out.println("Test passed");
//        driver.quit();
//
//    }
//
//    public static void DynamicTable() {
//
//        driver.get("http://www.uitestingplayground.com/");
//
//        driver.findElement(By.xpath("//a[contains(text(), \"Dynamic Table\")]")).click();
//
//        String cpuValue = driver.findElement(By.xpath("//p[contains(text(), 'Chrome CPU:')]")).getText();
//
//        String[] cpuValue2 = cpuValue.split(":", 2);
//        String var1 = cpuValue2[1].replaceAll("\\s","");
//        String var2 = "";
//
//        for  (int i=1; i<=4; i++)
//        {
//            String xpathRowString = String.format("/html/body/section/div/div/div[3]/div[%d]", i);
//            String row = driver.findElement(By.xpath(xpathRowString)).getText();
//            if (row.contains("Chrome")){
//                for (int j=2; j<=5; j++) {
//                    String procentValuexpath = String.format("/html/body/section/div/div/div[3]/div[%d]/span[%d]", i, j);
//                    String procentValue = driver.findElement(By.xpath(procentValuexpath)).getText();
//                    if (procentValue.contains("%"))
//                    {
//                        var2 = procentValue;
//                        break;
//                    }
//                }
//                break;
//            }
//        }
//        System.out.println(var1);
//        System.out.println(var2);
//
//        Assert.assertEquals(var1,var2);
//        System.out.println("Test passed");
//        driver.quit();
//    }
//
//    public static void DynamicTable2() {
//        driver.get("http://www.uitestingplayground.com/");
//
//        driver.findElement(By.xpath("//a[contains(text(), \"Dynamic Table\")]")).click();
//
//        String cpuValue = driver.findElement(By.xpath("//p[contains(text(), 'Chrome CPU:')]")).getText();
//
//        String[] cpuValue2 = cpuValue.split(":", 2);
//        String var1 = cpuValue2[1].replaceAll("\\s","");
//
//        String tableCpuValue = driver.findElement(By.xpath("//span[text()='Chrome']/following-sibling::span[contains(text(), '%')]")).getText();
//
//
//        System.out.println(var1);
//        System.out.println(tableCpuValue);
//
//
//        Assert.assertEquals(var1,tableCpuValue);
//        System.out.println("Test passed");
//        driver.quit();
//
//    }
//
//
//
//    public static void VerifyText() {  //need to be finish
//        driver.get("http://www.uitestingplayground.com/");
//
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div[3]/h3/a")).click();
//
//        WebElement elementContainsWelcome = driver.findElement(By.xpath("//span[normalize-space(.)='Welcome UserName!']"));
//
////    String getTextFromDiv = driver.findElement(By.xpath("//div/span[contains(text(), 'Welcome')]")).getText();
////
////        String[] firstPartOfSpan = getTextFromDiv.split(":", 2);
////        String var1 = firstPartOfSpan[1].replaceAll("\\s","");
////
////        getTextFromDiv.getText();
////        System.out.println(getTextFromDiv);
////        Assert.assertEquals(getTextFromDiv.getText(), "Welcome");
//
//    }
//
//    public static void ProgressBar() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[text()='Progress Bar']\n")).click();
//        driver.findElement(By.xpath("//button[@id=\"startButton\"]\n")).click();
//
//        WebDriverWait waitUntil = new WebDriverWait(driver, 30);
//        waitUntil.until((ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'75%')]"))));
//        String procentValueOfProgressBar = driver.findElement(By.xpath("//div[contains(text(),'75%')]")).getText();
//        if (procentValueOfProgressBar.contains("75%")){
//            driver.findElement(By.xpath("//button[@id='stopButton']")).click();
//
//        }
////        driver.findElement(By.xpath("//button[@id='stopButton']")).click();
//    }
//
//    public static void Visibility1() { //дописати ассерт
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[contains(text(), 'Visibility')]")).click();
//
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));
//
//        for ( int i=0; i<buttons.size();i++)
//        {
//            WebElement button = buttons.get(i);
//
//            System.out.println(button.getText());//It prints all the buttons name displayed on the page
//
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebElement hideButton = driver.findElement(By.xpath("//*[@id=\"hideButton\"]"));
//        hideButton.click();
//        List<WebElement> buttons1 = driver.findElements(By.tagName("button"));
//
//        for ( int i=0; i<buttons1.size();i++)
//        {
//            WebElement button = buttons1.get(i);
//
//            System.out.println(button.getText());//ця команда виведе всі доступні кнопки на сторінці
//
//        }
//        Assert.assertEquals(buttons1, "Hide");
//        System.out.println("Displayed only Hide Button");
//        driver.quit();
//
//
//    }
//
//    public static void SampleApp() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[contains(text(), 'Sample App')]")).click();
//        driver.findElement(By.name("UserName")).sendKeys("John");
//        driver.findElement(By.name("Password")).sendKeys("pwd");
//        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
//    }
//
//    public static void MouseOver() {
//        driver.get("http://www.uitestingplayground.com/");
//        driver.findElement(By.xpath("//a[text()=\"Mouse Over\"]")).click();
//        driver.findElement(By.xpath("//a[text()=\"Click me\"]")).click();
//        driver.findElement(By.xpath("//a[text()=\"Click me\"]")).click();
//
//        String clickValue = "2";
//        String clickValu2 = driver.findElement(By.xpath("//span[@id=\"clickCount\"]")).getText();
//        Assert.assertEquals(clickValue,clickValu2);
//        System.out.println("Test passed");
//        driver.quit();
//
//    }
//
//    public static void SpaceBreak() {
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div[4]/h3/a")).click();
//        driver.findElement(By.xpath("//button[text()='My\u00a0Button']")).click();
//    }
//
//}