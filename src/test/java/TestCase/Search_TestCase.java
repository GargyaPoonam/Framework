package TestCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Base;
import Dataprovider.Excel;
import PAgeObject.CategoryPage;
import PAgeObject.Search;

   public class Search_TestCase extends Base {
	
	 @Test(priority =1, enabled = false)
	    public void searchProducts() throws IOException, InterruptedException {
	        Search find = PageFactory.initElements(driver, Search.class);
	        Excel excel = new Excel();
	        List<String> columnData = excel.getColumnData("testdata", 0); 
	        for (String value : columnData) {
	            System.out.println(value);
	            find.Search1(value);
	        }
	        
	    }
	    @Test(priority =2)
	    public void SearchElectronics() throws InterruptedException{
	        CategoryPage find1 = PageFactory.initElements(driver, CategoryPage.class);
	    	find1.searchOncategory();
	        
	        }
}