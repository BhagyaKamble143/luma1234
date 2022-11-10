package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class123 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(4000);
    driver.manage().window().maximize();//maximize browser
    Thread.sleep(6000);
     driver.findElement(By.id("email")).sendKeys("8329937502");
     Thread.sleep(7000);
     driver.findElement(By.id("pass")).sendKeys("anuja100%");
    // driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("Suhas100%");
     Thread.sleep(3000);
     driver.findElement(By.tagName("button")).click();
     Thread.sleep(9000);
     driver.close();
	}
}
