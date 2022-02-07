package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class DataTablesTest extends BaseTest {

    @Test
    public void dataTableTest() {
        driver.get(WebUrls.HEROKU_APP_TABLES_URL);
        //Check 'Last Name' element
        Assert.assertEquals(driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[text()='Bach']")).getText(), "Bach");
        //Check 'First Name' element
        Assert.assertEquals(driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[text()='Frank']")).getText(), "Frank");
        //Check 'Due' element
        Assert.assertEquals(driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[text()='$51.00']")).getText(), "$51.00");
        //Check 'Web Site' element
        Assert.assertEquals(driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[text()='http://www.frank.com']")).getText(), "http://www.frank.com");
    }
}
