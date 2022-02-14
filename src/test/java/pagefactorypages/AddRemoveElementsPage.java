package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(css = "[oncLick='addElement()']")
    private WebElement addButton;

    @FindBy(css = "[onclick='deleteElement()']")
    private WebElement deleteButton;

    @FindBy(id = "elements")
    private WebElement buttons;


    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElementsPage() {
        driver.get(WebUrls.HEROKU_APP_ELEMENTS_URL);
    }

    public void addElement() {
        addButton.click();
    }

    public void removeElement() {
        deleteButton.click();
    }

    public String checkDeleteButtonsOnPage (){
        String numbersOfButtons = buttons.getAttribute("childElementCount");
        return numbersOfButtons;

    }


    }








