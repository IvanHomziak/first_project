import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicTable extends HomePageObjects{

    public DynamicTable(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "table_desc")
    private WebElement tableTitleName;

    @FindBy(className = "bg-warning")
    private WebElement cpuValueFroWarningMessage;

    @FindBy(xpath = "//span[text()='Chrome']/following-sibling::span[contains(text(), '%')]")
    private WebElement cpuValueFromTheTable;


    /* To get CPU values from the table we need to create two methods
        to get them from the table. This methods we recall in "DynamicTableTest"
        class.
    */

    public String getCpuValueFromTable() {
        DynamicTable dynamicTable = new DynamicTable(driver);
        String warningMessageFromDT = dynamicTable.cpuValueFroWarningMessage.getText();
        return warningMessageFromDT.split( " ")[2];
    }

    public String getCpuValueFromWarningMessage() {
        DynamicTable dynamicTable = new DynamicTable(driver);
        return dynamicTable.cpuValueFromTheTable.getText();
    }

    public String getTableName() {
        DynamicTable tableName = new DynamicTable(driver);
        return tableName.tableTitleName.getText();
    }
}
