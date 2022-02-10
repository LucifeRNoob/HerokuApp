package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class InputsTest extends BaseTest {

    @Test
    public void inputDigits() {
        driver.get(WebUrls.HEROKU_APP_INPUTS_URL);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.sendKeys("10");
        //Check ARROW_UP
        inputField.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(inputField.getAttribute("value"), "11", "ARROW_UP doesn't work");
        //Check ARROW_DOWN
        inputField.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(inputField.getAttribute("value"), "10", "ARROW_UP doesn't work");
    }
}
