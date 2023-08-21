package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import BrowserUtility.Utility;
import Dataprovider.Excel;

public class Base {
    public WebDriver driver;
    Excel excel;

  //  for excel data driven
    @BeforeSuite
    public void SetupSuite() throws IOException {
        excel = new Excel();
    }

    @BeforeMethod
    public void setup() {
        driver = Utility.StartBrowser(driver, "chrome", "https://www.flipkart.com");
    }

    @AfterMethod
    public void closeBrowser() {
        Utility.QuitBrowser(driver);
    }
}
