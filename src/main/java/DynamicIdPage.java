import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends HomePageObjects{

    //constructor
    public DynamicIdPage(WebDriver driver){

        super (driver);
    }

    @FindBy(linkText = "Button with Dynamic ID")
    private WebElement buttonLocation;



    public String findButtonByName() {
        DynamicIdPage buttonElement = new DynamicIdPage(driver);
        return buttonElement.buttonLocation.getText();
    }

    public void pressButtonM() {
        DynamicIdPage pressButtonOnThePage = new DynamicIdPage(driver);
        pressButtonOnThePage.buttonLocation.click();

    }








}
