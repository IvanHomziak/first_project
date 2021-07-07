import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributePage extends HomePageObjects{

    public ClassAttributePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class, ' btn-primary ')]")
    private WebElement findBlueButton;

    public void setFindBlueButtonOnPage() {
        ClassAttributePage blueButton = new ClassAttributePage(driver);
        blueButton.findBlueButton.click();

    }



}
