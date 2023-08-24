package dataDriverFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\gpman.000\\Downloads\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet2");
		DataFormatter df = new DataFormatter();
		for(int i = 1; i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(i);
		for(int j=1; j<r.getLastCellNum(); j++)
		{
			
			String cellvalues = df.formatCellValue(r.getCell(j));
			System.out.println(cellvalues);
		}
		}
		
	}

}
