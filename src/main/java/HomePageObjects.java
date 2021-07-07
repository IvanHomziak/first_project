import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends DriverForHomePageObjects{

    //
    public HomePageObjects(WebDriver driver) {
        /*якщо ми хочемо викликати конструктор батьківського класу, то ми його
        викликаємо через "super" */
        super(driver);
    }

        private String url = "http://www.uitestingplayground.com/";

        @FindBy(id = "title")
        private WebElement pageTitle;

        @FindBy(xpath = "//a[contains(text(), \"Dynamic ID\")]")
        private WebElement dynamicIdLink;

        @FindBy(linkText = "Class Attribute")
        private WebElement clssAttributeLink;

        @FindBy(linkText = "Hidden Layers")
        private WebElement hiddenLayersLink;

        @FindBy(linkText = "Load Delay")
        private WebElement loadDelayLink;

        @FindBy(linkText = "AJAX Data")
        private WebElement ajaxDataLink;

        @FindBy(linkText = "Client Side Delay")
        private WebElement clientSideDelay;

        @FindBy(linkText = "Click")
        private WebElement textInputLink;

        @FindBy(linkText = "Scrollbars")
        private WebElement scrollbarsLink;

        @FindBy(linkText = "Dynamic Table")
        private WebElement dynamicTableLink;

        @FindBy(linkText = "Verify Text")
        private WebElement verifyTextLink;

        @FindBy(linkText = "Progress Bar")
        private WebElement progressBarLink;

        @FindBy(linkText = "Visibility")
        private WebElement visibilityLink;

        @FindBy(linkText = "Sample App")
        private WebElement sampleAppLink;

        @FindBy(linkText = "Mouse Over")
        private WebElement mouseOverLink;

        @FindBy(linkText = "Non-Breaking Space")
        private WebElement nonBreakingSpaceLink;

//        @FindBy(xpath = "//p[@class=\"bg-warning\"]")
//        private WebElement dynamicTabbleUnderTableVAlue;





        public HomePageObjects openHomePageObjects() {
            driver.get(url);
            return this;
        }

        public DynamicTable openDynamicTablePage(){
            dynamicTableLink.click();
            return new DynamicTable(driver);
        }

        public DynamicIdPage openDynamicIdPage() {
            dynamicIdLink.click();
            return new DynamicIdPage(driver);
        }

        public ClassAttributePage openClassAttributePage() {
            clssAttributeLink.click();
            return new ClassAttributePage(driver);
        }






}
