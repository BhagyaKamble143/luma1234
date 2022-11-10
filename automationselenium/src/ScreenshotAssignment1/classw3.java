package ScreenshotAssignment1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class classw3 {
	
  public static void screen(String s) throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.w3schools.com/js/default.asp");//insert url
		   Thread.sleep(2000);
		    driver.manage().window().maximize();//browser maximize
		    Thread.sleep(3000);
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest = new File ("\\E:\\anuja\\"+s+".png");
	   FileHandler.copy(source, dest);
	  
	  driver.close();
	 
 }
}
