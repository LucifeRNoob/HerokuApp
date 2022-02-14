package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.DataTablePage;

public class DataTablesTest extends BaseTest {

    DataTablePage dataTablePage;

    @Test
    public void dataTableTest() {
        dataTablePage = new DataTablePage(driver);
        dataTablePage.openTablesPage();
        Assert.assertEquals(dataTablePage.lastNameElementPresence(),"Bach");
        Assert.assertEquals(dataTablePage.firstNameElementPresence(),"Frank");
        Assert.assertEquals(dataTablePage.dueElementPresence(),"$51.00");
        Assert.assertEquals(dataTablePage.webSiteElementPresence(), "http://www.frank.com");
    }
}
