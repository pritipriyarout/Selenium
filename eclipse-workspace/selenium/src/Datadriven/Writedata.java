package Datadriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws Throwable{
	FileInputStream fis=new FileInputStream("./TestDataa.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=0;i<rowcount;i++)
	{
		Row row1=sh.getRow(i);
		String coldata=row1.getCell(0).getStringCellValue();
		System.out.println(coldata);
	}
	

	}

}
