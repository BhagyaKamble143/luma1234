package CLOSEBROWSER;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classopenmulwindw {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.w3schools.com/js/default.asp");
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_myfirst']")).click();
		  Thread.sleep(2000);
		  String main =driver.getWindowHandle();//main windw id
		  String exURL="https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst";
		   Set<String> s=driver.getWindowHandles();//main+child both id
		 
		   for(String S1:s) {
			   
			   System.out.println(S1);
			   driver.switchTo().window(S1);
			   String actualURL=driver.getCurrentUrl();
			   if(exURL.equals(actualURL)) {
				   System.out.println("correct window");
				   break;
			   }else {
				   System.out.println("incorrect window");
			   }
		   }
		  
		driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
		  Thread.sleep(2000);
		driver.quit();
	}
}
