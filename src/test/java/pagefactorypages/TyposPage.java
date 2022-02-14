package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class TyposPage extends BasePage {

    @FindBy(xpath = "//p[2]")
    private WebElement typosText;


    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(WebUrls.HEROKU_APP_TYPOS_URL);
    }

    public String actualText() {
        return typosText.getText();
    }

    public String expectedText() {
        return "Sometimes you'll see a typo, other times you won't.";
    }
}
