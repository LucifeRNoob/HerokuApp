package pagefactorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class InputsPage extends BasePage {

    @FindBy(xpath = "//input[@type='number']")
    private WebElement inputField;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(WebUrls.HEROKU_APP_INPUTS_URL);
    }

    public void inputDigit() {
        inputField.sendKeys("10");
    }

    public void arrowUp() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void arrowDown() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String arrowUpDigit() {
        return inputField.getAttribute("value");
    }

    public String arrowDownDigit() {
        return inputField.getAttribute("value");
    }
}
