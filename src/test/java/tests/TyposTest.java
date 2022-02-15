package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.TyposPage;

public class TyposTest extends BaseTest {

    TyposPage typosPage;

    @Test
    public void typosTest() {
        typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertEquals(typosPage.actualText(), "Sometimes you'll see a typo, other times you won't.", "Mistake in the word - won't");
    }
}
