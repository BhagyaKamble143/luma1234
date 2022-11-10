package handleAlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://loadero.com/features/");
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		  driver.findElement(By.xpath("//button [text()='Accept']")).click();
		  Thread.sleep(3000);
		  //Alert Alt = driver.switchTo().alert();
		 // Alt.accept();
		  
		 driver.close(); 
		  
		    
	}

}
