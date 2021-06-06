package basicTest;

import jdk.jshell.execution.LoaderDelegate;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.lang.System;


public class HomePageTest extends driver {
    String driverPath = "/home/ivan/Documents/geckodriver";



/*    WebDriver driver;
    HomePage homePage;*/



    @BeforeTest //this is a pre-conditions
    public void setup() {
        System.setProperty("WebDriver.gecko.driver" , driverPath);
        /*driver.get("http://www.uitestingplayground.com/");*/
        driver.get("http://www.uitestingplayground.com/");


    }

    @AfterTest //post-conditions
    public void endTest() {
        driver.quit();
        System.out.println("Tests have passed");
    }

    @Test
    public void FindElementDynamicID() {
        HomePage.FindElementDynamicID();
        driver.quit();
    }

    @Test
    public void ClassAttribute(){
        HomePage.ClassAttribute();
        driver.quit();
    }

    @Test
    public void HiddenLayers1(){
        HomePage.HiddenLayers1();
        driver.quit();
    }

    @Test
    public void AJAXData() {
        HomePage.AJAXData();
        driver.quit();
    }

//    @Test
//    public void LoaderDelegate(){
//        HomePage.LoadDelays();
//    }
//    @Test
//    public void AJAXData(){
//        HomePage.AJAXData();
//    }



















//    @Test
//    public void CheckTekstHomePage() {
//        HomePage.CheckTekstHomePage();
//        driver.quit();
//    }
//
//    @Test
//    public void CheckPicture(){
//        HomePage.CheckPicture();
//        driver.quit();
//
//    }
//
//
//
//    @Test
//    public void ApacheLicense() {
//        HomePage.ApacheLicense();
//        driver.quit();
//    }
//
//
//
//
//    @Test
//    public void HitButtonTwice(){
//        HomePage.HitButtonTwice();
//        HomePage.pausePage(1000);
//        HomePage.QuitBrowser();
//    }
    /*@Test //
    public void testHomePageTitile() {
        WebDriver driver = new FirefoxDriver();

        //тест має створити сторінку і з нею повзаємодіяти. Саме тому ми створюємо сторінку:
        homePage = new HomePage(driver);

         *//* далі витягаємо title за допомогою метода який ми створили попередньо getTitleText.
         це метод описаний в файлі HomePage.java, звідти ми його підтягуємо сюди:*//*
        String title = homePage.getTitleText();

        *//* Після того як ми витягнули тайтл ми маємо його порівняти з очікуваним тайтлом
        на цій сторінці. Для цього ми використовуємо ассерти. Ассерти порівнюють фактичний
        результат з очікуваним:*//*
        Assert.assertEquals("UI Test Automation\n" +"Playground", title);*/




}