package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class DataTablePage extends BasePage {

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")
    private WebElement lastName;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")
    private WebElement firstName;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[1]")
    private WebElement due;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[2]")
    private WebElement webSite;


    public DataTablePage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(WebUrls.HEROKU_APP_TABLES_URL);
    }

    public String lastNameElementPresence() {
        return lastName.getText();
    }

    public String firstNameElementPresence() {
        return firstName.getText();
    }

    public String dueElementPresence() {
        return due.getText();
    }

    public String webSiteElementPresence() {
        return webSite.getText();
    }
}
