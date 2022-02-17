package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

import java.io.File;


public class UploadPage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileName;

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void openUploadPage (){
        driver.get(WebUrls.HEROKU_APP_UPLOAD_URL);
    }

    public void uploadFile () {
        File file = new File("src/test/resources/test.txt");
        chooseFileButton.sendKeys(file.getAbsolutePath());
        uploadButton.click();
    }

    public String fileNameMatchFileNameText () {
        return uploadedFileName.getText();
    }
}
