package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class CheckboxesPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    private WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(WebUrls.HEROKU_APP_CHECKBOX_URL);
    }

    public void clickFirstCheckbox() {
        checkbox1.click();
    }

    public void clickSecondCheckbox() {
        checkbox2.click();
    }

    public boolean firstCheckboxChecked() {
        return checkbox1.isSelected();
    }

    public boolean secondCheckboxChecked() {
        return checkbox2.isSelected();
    }
}
