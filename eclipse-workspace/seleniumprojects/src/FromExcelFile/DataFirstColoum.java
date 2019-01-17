package FromExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFirstColoum {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//step1 get the title readnew  object of the physical workbook
				FileInputStream fis= new FileInputStream("C:\\Users\\sanjaya\\eclipse-workspace\\seleniumprojects\\TestData.xlsx");
				//open workbook in read mode
				Workbook wb=WorkbookFactory.create(fis);
				//get the control of sheet1
				Sheet sh=wb.getSheet("sheet1");
				//get the control of row 2
				 int rowcount=sh.getLastRowNum();
				 for(int i=0;i<rowcount;i++)
				 {
					 Row row1=sh.getRow(i);
					 String colData=row1.getCell(0).getStringCellValue();
					 System.out.println(colData);
				 }
			
	}

}
