package iframe;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ScreenshotAssignment1.main;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.w3schools.com/js/js_popup.asp");//insert url
		   Thread.sleep(2000);
		    driver.manage().window().maximize();//browser maximize
		   
		    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		   
		    ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
		      driver.switchTo().window(ar.get(1));//
		    driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		    
		    WebElement tryItframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		    driver.switchTo().frame(tryItframe);//by wbelment type Argument
		    driver.findElement(By.xpath("//button[text()='Try it']")).click();
		    
		   // driver.switchTo().frame(1);//by int index type argument
		   // driver.switchTo().frame("iframeResult");//by String type arrgument i,e value of any Atributes
		    Thread.sleep(2000);
		    Alert Al=driver.switchTo().alert();
		    Al.accept();
		    Thread.sleep(2000);
		    driver.switchTo().defaultContent();
		   
		    driver.findElement(By.xpath("//a[@title='Change Theme']")).click(); 
		    Thread.sleep(2000);
		    driver.close();
		  
		    
	}

}
