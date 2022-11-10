package handleAlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		 // driver.findElement(By.xpath("//input [@name='alert']")).click();
		  //driver.findElement(By.xpath("//input [@name='confirmation']")).click();
		  driver.findElement(By.xpath("//input [@name='prompt']")).click();
		  
		  Thread.sleep(3000);
		  Alert Alt = driver.switchTo().alert();
		  
		  //Alt.accept();
		  Thread.sleep(3000);
		  //Alt.dismiss();
		  //Thread.sleep(3000);
		  Alt.sendKeys("yes");//
		  Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
