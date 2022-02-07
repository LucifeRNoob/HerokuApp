package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;
import java.util.List;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElementsTest() {
        driver.get(WebUrls.HEROKU_APP_ELEMENTS_URL);
        WebElement addButton = driver.findElement(By.cssSelector("[oncLick='addElement()']"));
        //Add buttons
        addButton.click();
        addButton.click();
        List<WebElement> deleteButton = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        Assert.assertEquals(deleteButton.size(),2,"The number of elements is not equal to 2");
        //Delete first 'Delete' button
        deleteButton.get(0).click();
        deleteButton = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        Assert.assertEquals(deleteButton.size(),1,"The number of elements is not equal to 1");
    }
}
