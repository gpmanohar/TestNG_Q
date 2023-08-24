package genricUtilityorLibrary;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public 	String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception, IOException {
		FileInputStream fis = new FileInputStream(IconstantUtility.Excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String data =df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return data;
		
	
		
		
		
		
		
		
		
		
		

	}

}
