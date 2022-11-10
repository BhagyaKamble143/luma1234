package CLOSEBROWSER;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classchildbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.w3schools.com/js/js_intro.asp");//main window
		    Thread.sleep(2000);
		    driver.manage().window().maximize();//
		    Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_intro_inner_html']")).click();//
		  
		  String expUrl= "https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html";
		  Thread.sleep(3000);
		String main =  driver.getWindowHandle();// RT-String//return to main windw id 
		  Thread.sleep(3000);
	 ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());//fetch 2 id main and child browser//RT Set<String>
		driver.switchTo().window(al.get(1));//always main windw  id is 0 th index  id//1st index child browser windows return
			   Thread.sleep(2000);
		
			driver.findElement(By.xpath("//a[@title='Save code']")).click();
			  Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Sign up for free']")).click();
			  Thread.sleep(2000);
		driver.close();//current browser close//which  id fetch? main id fetch
		  Thread.sleep(2000);
		 driver.switchTo().window(al.get(0));//main windows
		  Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_intro_lightbulb']")).click();
	 // Thread.sleep(3000);
	  //driver.switchTo().window(al.get(1));
    // driver.findElement(By.xpath("//a[@id=\'menuButton\']")).click();
	    
			 Thread.sleep(3000); 
			 
			  driver.quit();
			  
		  }
		  
	}


