package Datadriven;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws Throwable{
	FileInputStream fis=new FileInputStream("‪‪./TestDataa.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	Row rw=sh.getRow(1);
	Cell cel=rw.getCell(2);
	String username=cel.getStringCellValue();
	System.out.println(username);
	wb.close();
	
	
	

	}

}
