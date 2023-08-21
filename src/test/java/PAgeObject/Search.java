package PAgeObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	WebDriver driver;
	WebDriverWait wait;
	public Search(WebDriver driver) {
		this.driver  = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@FindBy(name ="q") WebElement search;
	@FindBy(xpath="//button[text()='✕']") WebElement ClosePopup; // for close login popup button


	public void Search1(String product) throws InterruptedException {
	
//	      ClosePopup.click();
//		if (ClosePopup.isDisplayed()) {
//			ClosePopup.click();	}
		search.sendKeys(product);
		 Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		search.clear();
		
		
	}

}
