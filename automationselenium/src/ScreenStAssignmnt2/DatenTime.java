package ScreenStAssignmnt2;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class DatenTime {

	public static void Shot() throws InterruptedException, IOException  {
		  System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
									
					WebDriver driver = new ChromeDriver(); //Browser Launch
			    driver.get("https://www.w3schools.com/js/default.asp");//insert url
			   Thread.sleep(2000);
			    driver.manage().window().maximize();//browser maximize
			    Thread.sleep(3000);
			    Date dt=new Date();
				  //Time tm=new Time(2);
			String S1=dt.toString().replace(' ', '_').replace(':', '-');//tm.getTime();
				   System.out.println(S1);
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File Dest = new File ("E:\\anuja\\anu"+S1+".jpg");
		   //File Dest = new File ("E:\\anuja\\anu.jpg");
           FileHandler.copy(source,Dest );

		  
	
	}
	
	
}

