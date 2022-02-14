package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {

    CheckboxesPage checkboxesPage;

    @Test
    public void firstCheckboxTest() {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.firstCheckboxChecked(),"Checkbox 1 checked");
        checkboxesPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.firstCheckboxChecked(),"Checkbox 1 unchecked");
    }

    @Test
    public void secondCheckboxTest() {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondCheckbox();
        Assert.assertTrue(checkboxesPage.secondCheckboxChecked(),"Checkbox 2 unchecked");
        checkboxesPage.clickSecondCheckbox();
        Assert.assertFalse(checkboxesPage.secondCheckboxChecked(),"Checkbox 2 checked");
    }
}
