package practice_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataWithOutHardCoding {
      public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	  FileInputStream fis = new FileInputStream("./src/test/resources/Readdata.xlsx");
 	      Workbook wb = WorkbookFactory.create(fis);
 	     int rowCount = wb.getSheet("RegisterApp").getLastRowNum();
 	     int colCount = wb.getSheet("RegisterApp").getRow(0).getLastCellNum();
 	     
 	     for(int i=1; i<=rowCount; i++) {
 	    	 for(int j=0; j<colCount; j++) {
 	    		String data = wb.getSheet("RegisterApp").getRow(i).getCell(j).getStringCellValue();
 	    		System.out.println(data);
 	    	 }
 	    	 
 	     }
 	   
	}
}
