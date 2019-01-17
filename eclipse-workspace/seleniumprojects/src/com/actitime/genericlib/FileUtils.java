package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
String excelPath="C:\\Users\\sanjaya\\eclipse-workspace\\seleniumprojects\\TestData.xlsx";
String propertiesfile="./Datadriven.properties";
/**
 * @return
 * @throws Throwable
 * its return object of the properties file and load all keys
 */
public Properties getPropertiesFileobj() throws Throwable
{
	FileInputStream fis=new FileInputStream(propertiesfile);
	Properties pobj=new Properties();
	pobj.load(fis);
	return pobj;
}
/**
 *@param sheetName,rowNum,colNum
 *@return String
 * @throws IOException 
 * @throws InvalidFormatException 
 * @throws EncryptedDocumentException 
 * @throws Throwable
 *its used to raed the data from excelsheet based on user argumaent
 */
 public String getExcelData(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
 {
	 FileInputStream fis=new FileInputStream(excelPath);
	 Workbook wb=WorkbookFactory.create(fis);
	 Sheet sh=wb.getSheet(sheetName);
	 Row row=sh.getRow(rowNum);
	 String data=row.getCell(colNum).getStringCellValue();
	 wb.close();
	 return data;
 }
 /**
  * @param  sheetName
  * @param rowNum
  * @param colNum
  * @param data
  * @throws Throwable
  * its used to write data back to excel based on user argument
  */
  public void setExcelData(String SheetName,int rowName,int colNum,String data)throws Throwable
  {
	  FileInputStream fis=new FileInputStream(excelPath);
	  Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row row=sh.getRow(rowName);
		Cell cel=row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();

}
}
