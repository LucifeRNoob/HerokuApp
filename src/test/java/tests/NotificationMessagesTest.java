package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void notificationMessagesTest() {
        driver.get(WebUrls.HEROKU_APP_NOTIFICATION_MESSAGES_URL);
        //Find and click on link 'Click here'
        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/notification_message']"));
        clickHere.click();
        //Find 'Notification message' element
        WebElement notificationMessage = driver.findElement(By.xpath("//div[@id='flash']"));
        String actualNotificationMessage = notificationMessage.getText().replace("×", "");
        String expectedNotificationMessage = "Action successful";
        Assert.assertEquals(actualNotificationMessage.trim(),expectedNotificationMessage.trim(), " Action unsuccesful, please try again");
    }

}
