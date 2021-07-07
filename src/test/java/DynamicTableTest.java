import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicTableTest extends BaseTest {

    /* homePage is an object that declarative using of all parameters of "HomePageObjects"
    class. homePage could be use only in the class "DynamicTableTest". */
    static HomePageObjects homePage;

    /* before execute test we need to set up FireFoxDriver that is in "BaseTest" class
    and also we need create new object that helps us recall all elements and methods from
    "HomePageObjects" class with the before set up driver: homePage = new HomePageObjects(driver);
    */
    @BeforeTest
    public void setUp() {
        super.setUp();
        homePage = new HomePageObjects(driver);
    }

    @AfterTest
    public void exitTest(){
        super.exitTest();
    }

    @Test
    public void checkDynamicTablePage() {
        DynamicTable comparebleValue = homePage
                .openHomePageObjects()
                .openDynamicTablePage();

        String tableNameVariable = comparebleValue.getTableName();
        Assert.assertEquals(tableNameVariable, "Task Manager");

    }

    @Test
    public void testDynamicTableCpuValue1() {
        DynamicTable objDynamicTable = homePage
                .openHomePageObjects()
                .openDynamicTablePage();

        String val1 = objDynamicTable.getCpuValueFromTable();
        String val2 = objDynamicTable.getCpuValueFromWarningMessage();

        System.out.println(val1);
        System.out.println(val2);

        Assert.assertEquals(val1,val2);
    }




}
