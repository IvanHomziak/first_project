package basicTest;

import org.openqa.selenium.WebDriver; //
import org.openqa.selenium.By;

import java.awt.image.ByteLookupTable;


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
    public static void ClassAttribute(){
        driver.get("http://www.uitestingplayground.com/");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();

    }
/*    public String  getTitleText () {

        return driver.findElement(By.id("homeTabTitle")).getText();
    }*/

/*    public void ClickOnButton() {
        driver.findElement(By.id("buttonId")).click();

    }*/

/*    public HomePage(WebDriver driver) { //це конструктор який приймає драйвер.
        this.driver = driver; // створюємо обєкт драйвер*/


}
