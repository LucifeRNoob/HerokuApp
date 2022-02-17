package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.AlertsPage;

public class AlertsTest extends BaseTest {

    AlertsPage alertsPage;

    @Test
    public void checkJsAlertTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openAlert();
        String actualText = alertsPage.getAlertText();
        Assert.assertEquals(actualText, "I am a JS Alert", "Message 'Alert' is not expected");
    }

    @Test
    public void checkJsConfirmTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openConfirm();
        String actualText = alertsPage.getConfirmText();
        Assert.assertEquals(actualText, "I am a JS Confirm", "Message 'Confirm' is not expected");
    }

    @Test
    public void checkJsPromptAndTextIsDisplayedTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
        alertsPage.openPrompt();
        alertsPage.promptSendText();
        Assert.assertTrue(alertsPage.checkResultText(), "Text is not shown");
    }
}
