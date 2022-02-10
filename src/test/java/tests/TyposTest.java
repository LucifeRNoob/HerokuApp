package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class TyposTest extends BaseTest {

    @Test
    public void typosTest() {
        driver.get(WebUrls.HEROKU_APP_TYPOS_URL);
        //Find text
        WebElement typosText = driver.findElement(By.xpath("//p[2]"));
        //Check element on spelling mistakes
        String actualText = typosText.getText();
        String expectedText = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualText, expectedText, "Mistake in the word - won't");
    }
}
