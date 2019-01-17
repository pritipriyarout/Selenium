package FromExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws Throwable{
	//step1 get the title readnew  object of the physical workbook
		FileInputStream fis= new FileInputStream("C:\\Users\\sanjaya\\eclipse-workspace\\seleniumprojects\\TestData.xlsx");
		//open workbook in read mode
		Workbook wb=WorkbookFactory.create(fis);
		//get the control of sheet1
		Sheet sh=wb.getSheet("sheet1");
		//get the control of row 2
		Row row=sh.getRow(1);
		Cell cel=row.getCell(2);
		String customerName=cel.getStringCellValue();
		System.out.println(customerName);
		

	}

}
