package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.AddRemoveElementsPage;

public class AddRemoveElementsTest extends BaseTest {

    AddRemoveElementsPage addRemoveElementsPage;

    @Test
    public void addRemoveElementsTest() {
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openAddRemoveElementsPage();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        Assert.assertEquals(addRemoveElementsPage.checkDeleteButtonsOnPage(),"2","The number of elements is not equal to 2");
        addRemoveElementsPage.removeElement();
        Assert.assertEquals(addRemoveElementsPage.checkDeleteButtonsOnPage(),"1","The number of elements is not equal to 1");
    }
}
