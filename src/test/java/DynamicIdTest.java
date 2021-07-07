import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DynamicIdTest extends BaseTest {

    static HomePageObjects homePage1;

    @BeforeTest
    public void setUp() {
        super.setUp();
        homePage1 = new HomePageObjects(driver);

    }

    @AfterTest
    public void exitTest() {
        super.exitTest();
    }

    @Test
    public void checkDynamicIdPageButtonName() {
        DynamicIdPage checkPageButtonName = homePage
                .openHomePageObjects()
                .openDynamicIdPage();

        String pageTitle = checkPageButtonName.findButtonByName();
        Assert.assertEquals(pageTitle, "Button with Dynamic ID");
    }

    @Test
    public void pressButton() {
        DynamicIdPage pressButton1 = homePage1
                .openHomePageObjects()
                .openDynamicIdPage();

        pressButton1.pressButtonM();
    }
}
