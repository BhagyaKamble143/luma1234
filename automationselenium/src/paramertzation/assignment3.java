package paramertzation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignment3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\hp\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
		//WorkbookFactory.create(file);
		Workbook wb =WorkbookFactory.create(file);//RT workbook and prsent in wrkbkfactry
		 Sheet s1=wb.getSheet("Sheet1");//RT Sheet & present in WorkBook
		 Row R=s1.getRow(1);   //rt Row nd prsent in sheet//2
		    Cell C = R.getCell(0);// 
		int row =s1.getLastRowNum();
		
		 //System.out.println(row);
		
		int cell=R.getLastCellNum();
		
		 //System.out.println(cell);
		//for(int j=0;j<=row;j++) {
	   //int y=s1.getRow(j).getLastCellNum();
	  //System.out.println(y);
	 //System.out.print(s1.getRow(j));
		
	      for(int i=0;i<=cell-1;i++) {
	    	
			System.out.print(R.getCell(i));
			
	      }
	       //System.out.println();
	}
	}    

		 // for(Row row :s1) {
		// for(Cell cell:row) {
	   //Boolean b = C.getBooleanCellValue();
      //String S23=C.getStringCellValue();
     //Double d= C.getNumericCellValue();
    // System.out.println(d);
   //
  //}
	   //for(int j=0;j<row;j++) {
	  // System.out.println(s1.getRow(j));
	 //System.out.println(); 
			 
   //System.out.println(C.getStringCellValue())
	
			
//System.out.println(s1.getRow(i));
			 
			 //for(int j=0;j<=5;j++) {
				 
				//System.out.println(R.getCell(j));
			// }
			 
		 
		 //System.out.println(S23);



	
	
