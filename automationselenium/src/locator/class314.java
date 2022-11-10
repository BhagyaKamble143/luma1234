package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class314 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize();
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(3000);
    
    driver.findElement(By.name("email")).sendKeys("bhagyashrischoudhari@gmail.com");
    Thread.sleep(5000);
    driver.findElement(By.id("pass")).sendKeys("Suhas100%");
    Thread.sleep(5000);
    driver.findElement(By.name("login")).click();
  
    Thread.sleep(5000);
               
       driver.close();
	}
}
