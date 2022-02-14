package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.InputsPage;

public class InputsTest extends BaseTest {

    InputsPage inputsPage;

    @Test
    public void inputDigits() {
        inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.inputDigit();
        inputsPage.arrowUp();
        Assert.assertEquals(inputsPage.arrowUpDigit(),"11","ARROW_UP doesn't work");
        inputsPage.arrowDown();
        Assert.assertEquals(inputsPage.arrowDownDigit(),"10","ARROW_DOWN doesn't work");
    }
}
