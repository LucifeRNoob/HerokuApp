package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class NotificationMessagesPage extends BasePage {

    @FindBy(xpath = "//a[@href='/notification_message']")
    private WebElement clickHere;

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement notificationMessage;


    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagesPage() {
        driver.get(WebUrls.HEROKU_APP_NOTIFICATION_MESSAGES_URL);
    }

    public void clickLinkClickHere (){
        clickHere.click();

    }

    public String actualNotificationMessage() {
        return notificationMessage.getText().replace("×", "");
    }
}
