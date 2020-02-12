package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
    var uploadPage = homePage.clickFileUpload();
    uploadPage.uploadFile("C:\\Users\\nenad.petrovic\\Desktop\\Automation\\Angie Jones Github\\Selenium WebDriver Project\\src\\test\\resources\\chromedriver.exe");
    assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", "Uploaded file not correct");
    }
}
