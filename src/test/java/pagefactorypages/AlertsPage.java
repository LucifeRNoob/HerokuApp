package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class AlertsPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement jsConfirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement jsPrompt;

    @FindBy(id = "result")
    private WebElement resultText;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertPage() {
        driver.get(WebUrls.HEROKU_APP_ALERTS_URL);
    }

    public void openAlert() {
        jsAlertButton.click();
    }

    public String getAlertText() {
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }

    public void openConfirm() {
        jsConfirmButton.click();
    }

    public String getConfirmText() {
        String confirmText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return confirmText;
    }

    public void openPrompt() {
        jsPrompt.click();
    }

    public void promptSendText() {
        driver.switchTo().alert().sendKeys("Some text");
        driver.switchTo().alert().accept();
    }

    public boolean checkResultText() {
        return resultText.isDisplayed();
    }
}
