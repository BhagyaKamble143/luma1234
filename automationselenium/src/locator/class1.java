package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();
    
    Thread.sleep(5000);
    WebElement submit = driver.findElement(By.tagName("button"));
    Thread.sleep(4000);
    submit.click();
    Thread.sleep(6000);
    
               
       driver.close();
	}
}
