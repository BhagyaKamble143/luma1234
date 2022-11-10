package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();//maximize browser
 //Locate by using attributes id by using id method
  
   // driver.findElement(By.id("email")).sendKeys("bhagyashrischoudhari@gmail.com");
   // Thread.sleep(4000);
   
 //Locate by using attributes class by using className method
     driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("bhagyashrischoudhari@gmail.com");
    driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("shourya100%");
  
   Thread.sleep(5000);
   // driver.findElement(By.name("login")).click();
    
               
       driver.close();
	
	}
}
