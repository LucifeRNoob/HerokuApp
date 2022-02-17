package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.DropdownPage;

public class DropdownTest extends BaseTest {

    DropdownPage dropdownPage;

    @Test
    public void dropDownTest() {
        dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        dropdownPage.clickOnDropdown();
        //Presence of elements in dropdown
        Assert.assertEquals(dropdownPage.getFirstElement(), "Option 1", "First element is not shown");
        Assert.assertEquals(dropdownPage.getSecondElement(), "Option 2", "Second element is not shown");
        //Selecting an element and checking that the correct one is selected
        Assert.assertTrue(dropdownPage.selectFirstElement(),"Option 1 is not selected");
        Assert.assertTrue(dropdownPage.selectSecondElement(),"Option 2 is not selected");
    }
}
