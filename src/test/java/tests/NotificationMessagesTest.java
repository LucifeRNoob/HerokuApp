package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.NotificationMessagesPage;


public class NotificationMessagesTest extends BaseTest {

    NotificationMessagesPage notificationMessagesPage;

    @Test
    public void notificationMessagesTest() {
        notificationMessagesPage = new NotificationMessagesPage(driver);
        notificationMessagesPage.openNotificationMessagesPage();
        notificationMessagesPage.clickLinkClickHere();
        Assert.assertEquals(notificationMessagesPage.actualNotificationMessage().trim(),
                            notificationMessagesPage.expectedNotificationMessage().trim(),
                    " Action unsuccesful, please try again");
    }
}
