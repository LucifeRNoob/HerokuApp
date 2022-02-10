package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

import java.util.List;

public class CheckboxesTest extends BaseTest {

    @Test
    public void firstCheckboxTest() {
        driver.get(WebUrls.HEROKU_APP_CHECKBOX_URL);
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox'][1]"));
        Assert.assertFalse(checkbox.get(0).isSelected(), "Checkbox 1 checked");
        checkbox.get(0).click();
        Assert.assertTrue(checkbox.get(0).isSelected(), "Checkbox 1 unchecked");
    }

    @Test
    public void secondCheckboxTest() {
        driver.get(WebUrls.HEROKU_APP_CHECKBOX_URL);
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox'][2]"));
        checkbox.get(0).click();
        Assert.assertTrue(checkbox.get(0).isSelected(), "Checkbox 2 unchecked");
        checkbox.get(0).click();
        Assert.assertFalse(checkbox.get(0).isSelected(), "Checkbox 2 checked");
    }
}
