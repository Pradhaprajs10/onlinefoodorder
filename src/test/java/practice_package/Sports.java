package practice_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.IPathConstants;

public class Sports {

        @Test(dataProvider = "getData")
          public void sportsData(String Player, String Country, String Age, String Trophy) {
			System.out.println(Player  +"  "+Country+"  "+Age+"   "+Trophy);
		}
       @DataProvider
        public Object[][] getData() throws Throwable, Throwable {
        ExcelUtility eLib = new ExcelUtility();
        Object[] [] value = eLib.getDataProviderMultiple("Sports");
        return value;
}
}
