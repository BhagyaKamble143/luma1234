package iframe;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.hyrtutorials.com/?m=1");//insert url
		   Thread.sleep(2000);
		    driver.manage().window().maximize();//browser maximize
		    Thread.sleep(2000);
		   
		    
		   // Thread.sleep(2000);
		   // ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
		     // driver.switchTo().window(ar.get(1));//
		    //driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		   // Thread.sleep(2000);
	}
}
