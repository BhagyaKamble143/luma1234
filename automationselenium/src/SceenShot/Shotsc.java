package SceenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shotsc {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.facebook.com//");//insert url
		   Thread.sleep(2000);
		    driver.manage().window().maximize();//browser maximize
		    Thread.sleep(3000);
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest = new File ("E:\\anuja\\shot.jpg");
		   FileHandler.copy(source, dest);
		   Thread.sleep(3000);
		   driver.close();
	}

}
