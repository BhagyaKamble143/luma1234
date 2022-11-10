package assgn;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sh {
	static WebDriver driver;
	public static void main(String[] args) throws   IOException  {
		  System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
									
			 driver = new ChromeDriver(); //Browser Launch
			    driver.get("https://www.facebook.com//");//insert url
			  
			    driver.manage().window().maximize();//browser maximize
			    
			    screen();
			    
			    
			  }
	public static void screen() throws  IOException {
			    Date today=new Date();
				   
				   //Time tm=new Time(12);
				   //Thread.sleep(3000);
			    String test=today.toString().replace(' ', '_').replace(':', '-');
			    System.out.println(test);
			    
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest = new File ("\\E:\\anuja\\"+test+".png");
		   FileHandler.copy(source,dest) ;
		 
		
	}
}


