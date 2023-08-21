package PAgeObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	
	public CategoryPage(WebDriver driver) {
		this.driver  = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	
	@FindBy(xpath ="//span[contains(text(),'Electronics')]") WebElement Electronic;
	@FindBy(xpath ="//a[normalize-space()='Gaming']") WebElement Gaming;
	@FindBy(xpath ="//a[normalize-space()='All']") WebElement all;
//	@FindBy(xpath="//button[text()='✕']") WebElement ClosePopup;
	
	public void searchOncategory() throws InterruptedException {
	Thread.sleep(2000);
	Electronic.click();
	Thread.sleep(2000);
	Gaming.click();
	Thread.sleep(2000);
	all.click();




}

}
