package com.ofos.Generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelUtility {
/**
		 * This method is used to read data from excel
		 * @param sheetName
		 * @param row
		 * @param col
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws Throwable
		 */
	public String getExcelData(String sheetName, int row, int col) throws EncryptedDocumentException, Throwable {
		
		FileInputStream fi = new FileInputStream(IPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fi);
		String readData = wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		return readData;
	}
   /**
         * This method is used to write the data from excel
         * @param sheetName
         * @param row
         * @param col
         * @param value
         * @throws EncryptedDocumentException
         * @throws IOException
   */
	public void setExcelData(String sheetName, int row, int col,String value ) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(IPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).createRow(row).createCell(col).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(IPathConstants.EXCELPATH);
		wb.write(fos);	
	}
	/**
	 * This method is used to get multiple data from excel	
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNum(String sheetName) throws Throwable {
		
		FileInputStream fis = new FileInputStream(IPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}
	/**
	 * This method is used to readMultiple data from excel
	 * @param sheetName
	 * @param keyCell
	 * @param valueCell
	 * @return
	 * @throws Throwable
	 */
	public HashMap<String,String> readMultipleData(String sheetName, int keyCell, int valueCell,WebDriver driver) throws Throwable {
	    
		FileInputStream fi = new FileInputStream(IPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fi);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		
		HashMap<String,String> mp = new HashMap<String,String>();
		JavaUtility jLib = new JavaUtility();
		
		for(int i=0; i<rowCount; i++) {
			String key = wb.getSheet(sheetName).getRow(i).getCell(keyCell).getStringCellValue();
			String value = wb.getSheet(sheetName).getRow(i).getCell(valueCell).getStringCellValue();
			mp.put(key, value);
		}
		for(Entry<String, String> set : mp.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	}
	    return mp;
	}
	
	public Object[][] getDataProviderMultiple(String sheetName) throws EncryptedDocumentException, Throwable {
		
	     FileInputStream fis = new FileInputStream(IPathConstants.EXCELPATH);
   	     Workbook wb = WorkbookFactory.create(fis);
   	     Sheet sh = wb.getSheet(sheetName);
   	     int rowCount = sh.getLastRowNum()+1;
   	     int colCount = sh.getRow(0).getLastCellNum();
   	 
   	    Object[][] obj = new Object[rowCount][colCount];
   	     for(int i=0; i<rowCount; i++) {
   		  for(int j=0; j<colCount; j++) {
   			obj [i][j] = sh.getRow(i).getCell(j).getStringCellValue();
   		 }
   	 }
   	 return obj;
	}
	}
