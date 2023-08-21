package Dataprovider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
 
    
    XSSFWorkbook wb;
	public Excel()  {
		File src = new File("/Users/poonamsharma/eclipse-workspace/HybridReal11Admin/src/test/java/TestData/testdata.xlsx");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getStringData(String sheetname, int row, int cell ) {
		
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public List<String> getColumnData(String sheetname, int column) {
        List<String> columnData = new ArrayList<>();
        XSSFSheet sheet = wb.getSheet(sheetname);
        if (sheet != null) {
            for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
                XSSFRow row = sheet.getRow(rowNum);
                if (row != null) {
                    XSSFCell cell = row.getCell(column);
                    if (cell != null) {
                        columnData.add(cell.getStringCellValue());
                    }
                }
            }
        }
        return columnData;
          
}
}
	
    
