package practice_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Readdata.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     int rowCount = wb.getSheet("RegisterApp").getLastRowNum();
	     
	     for(int i=0; i<rowCount; i++) {
	    	 String un = wb.getSheet("RegisterApp").getRow(i).getCell(0).getStringCellValue();
	    	 String pwd = wb.getSheet("RegisterApp").getRow(i).getCell(1).getStringCellValue();
	    	 System.out.println(un+"------>"+pwd);
	     }
	}

}
