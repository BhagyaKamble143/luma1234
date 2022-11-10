package paramertzation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignmentNo4 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\hp\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
	//WorkbookFactory.create(file);
     Workbook wb =WorkbookFactory.create(file);//RT workbook and prsent in wrkbkfactry
	 Sheet s1=wb.getSheet("Sheet1");//RT Sheet & present in WorkBook
	 Row r=s1.getRow(0);
	 Cell c =r.getCell(0);
		int rowcount =s1.getLastRowNum();
	
	
		for(int i=0;i<=rowcount;i++) {
			int cellcount = s1.getRow(i).getLastCellNum();
				//int celltotal=r.getLastCellNum();
		System.out.println(s1.getRow(i));
	 for(int j=0;j<=cellcount-1;j++) {
     //  int rowcount =s1.getLastRowNum();
       r.getCell(j);
		System.out.println(r.getCell(j));
		 
		 if(c.equals(CellType.BOOLEAN)) {
        		Boolean b =c.getBooleanCellValue();
        		System.out.println(b);
        	}
        	else if(c.equals(CellType.NUMERIC))
        	{
        	double d =c.getNumericCellValue();	
        		System.out.println(d);
        	}else if(c.equals(CellType.STRING)) {
        		String s = c.getStringCellValue();
        		System.out.println(s);
        	}
        }
		}
		
	
}//System.out.println(rowcount);//System.out.println();
}