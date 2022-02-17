package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.UploadPage;

public class UploadTest extends BaseTest{

    UploadPage uploadPage;

    @Test
    public void uploadTest(){
        uploadPage = new UploadPage(driver);
        uploadPage.openUploadPage();
        uploadPage.uploadFile();
        Assert.assertEquals(uploadPage.fileNameMatchFileNameText(),"test.txt", "The file is not loaded");
    }
}
