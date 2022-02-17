package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import staticdata.WebUrls;

public class DropdownPage extends BasePage {


    @FindBy(id = "dropdown")
    private WebElement dropdown;

    @FindBy(css = "[value='1']")
    private WebElement option1;

    @FindBy(css = "[value='2']")
    private WebElement option2;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownPage() {
        driver.get(WebUrls.HEROKU_APP_DROPDOWN_URL);
    }

    public void clickOnDropdown() {
        dropdown.click();
    }

    public String getFirstElement() {
        Select select = new Select(dropdown);
        String firstElement = select.getOptions().get(1).getText();
        return firstElement;
    }

    public String getSecondElement() {
        Select select = new Select(dropdown);
        String secondElement = select.getOptions().get(2).getText();
        return secondElement;
    }

    public boolean selectFirstElement() {
        option1.click();
        return option1.isSelected();
    }

    public boolean selectSecondElement() {
        option2.click();
        return option2.isSelected();
    }
}




