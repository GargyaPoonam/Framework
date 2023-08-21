package BrowserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	//WebDriver driver;
	public static WebDriver StartBrowser(WebDriver driver, String BrowserName, String Url) {
		
		if(BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			System.out.println("we don't support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.manage().window().maximize();

        driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //    driver.switchTo().alert().dismiss();
		return driver;
		
		
	}
	public static void QuitBrowser(WebDriver driver) {
	//	driver.quit();
	}
	
	

}
