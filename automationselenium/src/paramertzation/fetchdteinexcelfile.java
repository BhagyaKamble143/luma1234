package paramertzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



import ScreenshotAssignment1.main;

public class fetchdteinexcelfile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\hp\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
		//WorkbookFactory.create(file);
		Workbook wb =WorkbookFactory.create(file);//RT workbook and prsent in wrkbkfactry
		 Sheet s1=wb.getSheet("Sheet1");//RT Sheet & present in WorkBook
		Row R=s1.getRow(0);//rt Row nd prsent in sheet
		 Cell C = R.getCell(0);
		 Boolean b = C.getBooleanCellValue();
		 String S23=C.getStringCellValue();
		Double d= C.getNumericCellValue();
		 System.out.println(d);
		
		
			
						
				
		
	}
	

}
