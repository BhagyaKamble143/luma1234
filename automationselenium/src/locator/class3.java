package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();//maximize browser
    //Locate by using attributes class by using className method
    Thread.sleep(3000);
    
   WebElement passward = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
   Thread.sleep(4000);
   passward.sendKeys("Suhas100%");//enter email-id in that field
   Thread.sleep(6000);
 
   WebElement loginbutton = driver.findElement(By.tagName("button"));
   Thread.sleep(4000);
   loginbutton.click();
      driver.close();
   
              
	}
}
